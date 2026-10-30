/*
 * TCSS 143 - Spring 2024
 * Project 2.java
 * Assignment 2
 * Instructor: Dongfang Zhao
 */
 
/**
 * This program represents an abstract class MediaItem, which is a subclass of Item.
 * It serves as the base class for media items in a library system, such as CDs.
 * The MediaItem class inherits properties and methods from the Item class and adds functionality
 * specific to media items.
 *
 * James Loughran Fischer
 * 5/14/2024
 */
public abstract class MediaItem extends Item {
    private double runtime;

    /**
     * Constructs a MediaItem object with the specified ID, title, and runtime.
     *
     * @param id      the unique identifier for the media item
     * @param title   the title of the media item
     * @param runtime the runtime of the media item
     */
    public MediaItem(int id, String title, double runtime) {
        super(id, title);
        this.runtime = runtime;
    }

    /**
     * Returns the runtime of the media item.
     *
     * @return the runtime of the media item
     */
    public double getRuntime() {
        return runtime;
    }

    /**
     * Sets the runtime of the media item.
     *
     * @param runtime the new runtime of the media item
     */
    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }
}

