/*
 * TCSS 143 B - Fundamentals Of Object-Oriented Programming Theory And Application - Spring 2024
 * Instructor: Dr.Dongfang Zhao
 * Programming Project 3 EditDistance
 */

/**
 * James Loughran Fischer
 * 5/25/2024
 * This program computes the edit distance between pairs of words.
*/
import java.io.*;
import java.util.*;

/**
 * The EditDistance class computes the edit distances between pairs of words
 * using a dictionary.
 * It contains methods for building a map of neighboring words, determining if
 * two words are neighbors,
 * computing the edit distance between two words, and prompting the user for
 * input.
 */
public class EditDistance {
    public static void main(String[] args) throws FileNotFoundException {
        giveIntro();
        Scanner console = new Scanner(System.in);
        System.out.print("What is the dictionary file? ");
        String fileName = console.nextLine();
        Scanner dictionary = new Scanner(new File(fileName));
        System.out.println();

        Map<String, List<String>> neighbors = buildMap(dictionary);
        doMatches(console, neighbors);
    }

    // program explained to the user
    public static void giveIntro() {
        System.out.println("This program uses a dictionary to compute the");
        System.out.println("edit distances between pairs of words.");
        System.out.println();
    }

    /**
     * Determines if two strings are neighbors and returns true if they are.
     * Two strings are considered neighbors if they are of the same length and
     * differ by exactly one character.
     * 
     * @param s1 the first string
     * @param s2 the second string
     * @return true if s1 and s2 are neighbors, false otherwise
     */
    public static boolean isNeighbor(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // Different lengths, not neighbors
        }

        int diffCount = 0; // Counter for differing characters

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++; // Increment the counter if characters differ
                if (diffCount > 1) {
                    return false; // More than one differing character, not neighbors
                }
            }
        }

        return diffCount == 1; // True if exactly one character differs
    }

    /**
     * Builds a map of words and their neighbors from a given dictionary.
     * Neighbors are defined as words that can be obtained by changing a single
     * character in the original word.
     * 
     * @param dictionary a Scanner object containing the dictionary to be used
     * @return a Map<String, List<String>> object containing the words and their
     *         neighbors
     */
    public static Map<String, List<String>> buildMap(Scanner dictionary) {
        Map<String, List<String>> result = new HashMap<>();
        List<String> words = new ArrayList<>();

        while (dictionary.hasNext()) {
            String word = dictionary.next();
            words.add(word); // Add all words to the list
            result.put(word, new ArrayList<>()); // Initialize the map with empty lists
        }

        for (String word1 : words) {
            for (String word2 : words) {
                if (isNeighbor(word1, word2)) {
                    result.get(word1).add(word2); // Add neighbors to the list
                }
            }
        }

        return result; // Return the completed map
    }

    /**
     * Prints the path from word1 to word2 using the given path map.
     * 
     * @param word1 the starting word
     * @param word2 the ending word
     * @param path  a map containing the path from word2 to word1
     */
    public static void showPath(String word1, String word2, Map<String, String> path) {
        StringBuilder result = new StringBuilder(word2);
        String current = word2;

        while (!current.equals(word1)) {
            current = path.get(current); // Get the predecessor
            result.insert(0, current + ", "); // Prepend to the result
        }

        System.out.println(result); // Print the path
    }

    /**
     * Calculates the edit distance between two given words using a map of
     * neighbors.
     * 
     * @param word1     the first word
     * @param word2     the second word
     * @param neighbors a map of neighbors for each word
     * @return the edit distance between the two words, or -1 if no path is found
     */
    public static int editDistance(String word1, String word2, Map<String, List<String>> neighbors) {
        int distance = 0;
        int numNeighbors = 1;
        int nextNumNeighbors = 0;
        int count = 0;

        LinkedList<String> candidates = new LinkedList<>();
        candidates.add(word1); // Start with the first word

        Set<String> explored = new HashSet<>();
        Map<String, String> path = new HashMap<>();

        while (!candidates.isEmpty()) {
            String current = candidates.poll();
            count++;

            if (current.equals(word2)) {
                showPath(word1, word2, path); // Show the path if found
                return distance; // Return the distance
            }

            explored.add(current);

            for (String neighbor : neighbors.get(current)) {
                if (!explored.contains(neighbor) && !candidates.contains(neighbor)) {
                    candidates.add(neighbor);
                    path.put(neighbor, current); // Track the path
                    nextNumNeighbors++;
                }
            }

            if (count == numNeighbors) {
                distance++;
                numNeighbors = nextNumNeighbors;
                nextNumNeighbors = 0;
                count = 0;
            }
        }

        return -1; // Return -1 if no path is found
    }

    /**
     * Prompts the user to enter two words and finds the edit distance between them
     * using the editDistance method.
     * If either word is not in the dictionary, it prints an error message.
     * Continues prompting until the user enters an empty string.
     *
     * @param console   the Scanner object to read user input from
     * @param neighbors a Map containing the dictionary words and their neighbors
     */
    public static void doMatches(Scanner console, Map<String, List<String>> neighbors) {
        for (;;) {
            System.out.println("Let's find an edit distance between words.");
            System.out.print("    first word (enter to quit)? ");
            String word1 = console.nextLine().trim();
            if (word1.length() == 0) {
                break;
            } else if (!neighbors.containsKey(word1)) {
                System.out.println(word1 + " is not in the dictionary");
            } else {
                System.out.print("    second word? ");
                String word2 = console.nextLine().trim();
                if (!neighbors.containsKey(word2)) {
                    System.out.println(word2 + " is not in the dictionary");
                } else {
                    int distance = editDistance(word1, word2, neighbors);
                    if (distance == -1) {
                        System.out.println("No solution");
                    } else {
                        System.out.println("Edit distance = " + distance);
                    }
                }
            }
            System.out.println();
        }
    }
}
