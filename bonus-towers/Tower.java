/*
 * TCSS 143 B - Fundamentals Of Object-Oriented Programming Theory And Application - Spring 2024
 * Instructor: Dr.Dongfang Zhao
 * Programming Project 4 Tower.java
 */

/**
 * James Loughran Fischer
 * 6/6/2024
 * This class provides methods to solve the Towers of Hanoi puzzle.
 * It includes a method to simulate the action of moving a disk and a recursive method to solve the puzzle.
 */
public class Tower {

    /**
     * Simulates the action of moving a disk from one tower to another.
     * @param source the tower from which to move the disk (type char)
     * @param dest the tower to which to move the disk (type char)
     */
    public static void moveOneDisk(char source, char dest) {
        System.out.println("Move disk from " + source + " to " + dest);
    }

    /**
     * Solves the Towers of Hanoi puzzle for n disks using recursion.
     * @param n the number of disks to move (type int)
     * @param source the tower from which to move the disks (type char)
     * @param dest the tower to which to move the disks (type char)
     * @param temp the temporary tower used for storage (type char)
     */
    public static void moveDisks(int n, char source, char dest, char temp) {
        if (n == 1) {
            // Base case: move one disk directly from source to destination
            moveOneDisk(source, dest);
        } else {
            // Move n-1 disks from source to temporary tower
            moveDisks(n - 1, source, temp, dest);
            // Move the nth disk from source to destination
            moveOneDisk(source, dest);
            // Move the n-1 disks from temporary tower to destination
            moveDisks(n - 1, temp, dest, source);
        }
    }
}