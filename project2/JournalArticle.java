/*
 * TCSS 143 - Spring 2024
 * Project 2.java
 * Assignment 2
 * Instructor; Dongfang Zhao
 */
 
 /**
 * This program represents a JournalArticle class, which is a subclass of WrittenItem.
 * It is designed to model journal articles in a library system.
 * The JournalArticle class inherits properties and methods from the WrittenItem class
 * and adds functionality specific to journal articles.
 *
 * James Loughran Fischer
 * 5/14/2024
 */
 public class JournalArticle extends WrittenItem {
    public JournalArticle(int id, String title, String author) {
        super(id, title, author);
    }
}
