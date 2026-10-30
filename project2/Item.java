/*
 * TCSS 143 - Spring 2024
 * Project 2.java
 * Assignment 2
 * Instructor: Dongfang Zhao
 */
 
/**
 * This program defines an abstract class Item, which serves as the base class for various
 * items in a library system. It provides common functionality and attributes for all items.
 *
 * James Loughran Fischer
 * 5/14/2024
 */
public abstract class Item {
    private int id;
    private String title;
    private boolean isInStock;

    /**
     * Constructs an Item object with the specified ID and title.
     *
     * @param id    the unique identifier for the item
     * @param title the title of the item
     */
    public Item(int id, String title) {
        this.id = id;
        this.title = title;
        this.isInStock = true; // Default is true
    }

    /**
     * Marks the item as checked out.
     */
    public void checkOut() {
        isInStock = false;
    }

    /**
     * Marks the item as returned.
     */
    public void returnItem() {
        isInStock = true;
    }

    /**
     * Returns the ID of the item.
     *
     * @return the ID of the item
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the title of the item.
     *
     * @return the title of the item
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns whether the item is currently in stock.
     *
     * @return true if the item is in stock, false otherwise
     */
    public boolean isInStock() {
        return isInStock;
    }

    /**
     * Sets the ID of the item.
     *
     * @param id the new ID of the item
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the title of the item.
     *
     * @param title the new title of the item
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
