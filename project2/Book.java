/*
 * TCSS 143 - Spring 2024
 * Project 2.java
 * Assignment 2
 * Instructor: Dongfang Zhao
 */
 
/**
 * This program represents a class Book, which is a subclass of WrittenItem.
 * It represents books in a library system and extends functionality specific to written items.
 *
 * James Loughran Fischer
 * 5/14/2024
 */
public class Book extends WrittenItem {
    
    /**
     * Constructs a Book object with the specified ID, title, and author.
     *
     * @param id     the unique identifier for the book
     * @param title  the title of the book
     * @param author the author of the book
     */
    public Book(int id, String title, String author) {
        super(id, title, author);
    }
}

