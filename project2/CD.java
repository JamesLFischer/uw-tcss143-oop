/*
 * TCSS 143 - Spring 2024
 * Project 2.java
 * Assignment 2
 * Instructor: Dongfang Zhao
 */
 
/**
 * This program represents a class CD, which is a subclass of MediaItem.
 * It represents CDs in a library system and extends functionality specific to media items.
 *
 * James Loughran Fischer
 * 5/14/2024
 */
public class CD extends MediaItem {
    private String artist;
    private String genre;

    /**
     * Constructs a CD object with the specified ID, title, artist, genre, and runtime.
     *
     * @param id      the unique identifier for the CD
     * @param title   the title of the CD
     * @param artist  the artist of the CD
     * @param genre   the genre of the CD
     * @param runtime the runtime of the CD
     */
    public CD(int id, String title, String artist, String genre, double runtime) {
        super(id, title, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    /**
     * Returns the artist of the CD.
     *
     * @return the artist of the CD
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the artist of the CD.
     *
     * @param artist the new artist of the CD
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Returns the genre of the CD.
     *
     * @return the genre of the CD
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the CD.
     *
     * @param genre the new genre of the CD
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
