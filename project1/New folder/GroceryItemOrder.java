/*
 * TCSS 143 - Spring 2024
 * GroceryItemOrder.java
 * Assignment 1
 * Instructor; Dongfang Zhao
 */

/**
 * This programs purpose is to represent a request to purchase a particular item in a given quantity.
 */
public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
/**
 * This methods purpose is to return the total cost of this item order.
 */
    public double getCost() {
        return quantity * pricePerUnit;
    }
/**
 * This methods purpose is to modify the quantity of the item.
 */
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
/**
 * This methods purpose is to displays the item value.
 */
    public String toString() {
        return quantity + " of " + name;
    }
}
