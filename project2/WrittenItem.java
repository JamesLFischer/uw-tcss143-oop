/*
 * TCSS 143 - Spring 2024
 * Project 2.java
 * Assignment 2
 * Instructor: Dongfang Zhao
 */
 
/**
 * This program represents an abstract class WrittenItem, which is a subclass of Item.
 * It serves as the base class for written items in a library system, such as books and journal articles.
 * The WrittenItem class inherits properties and methods from the Item class and adds functionality
 * specific to written items.
 *
 * James Loughran Fischer
 * 5/14/2024
 */
public abstract class WrittenItem extends Item {
    private String author;

    /**
     * Constructs a WrittenItem object with the specified ID, title, and author.
     *
     * @param id     the unique identifier for the written item
     * @param title  the title of the written item
     * @param author the author of the written item
     */
    public WrittenItem(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    /**
     * Returns the author of the written item.
     *
     * @return the author of the written item
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the written item.
     *
     * @param author the new author of the written item
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
