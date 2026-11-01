/*
 * TCSS 143 - Spring 2024
 * GroceryList.java
 * Assignment 1
 * Instructor; Dongfang Zhao
 */

/**
 * This programs purpose is to represent a list of items to buy from the market.
 */
public class GroceryList {
    private static final int MAX_ITEMS = 10;
    private GroceryItemOrder[] items;
    private int numItems;

    public GroceryList() {
        items = new GroceryItemOrder[MAX_ITEMS];
        numItems = 0;
    }
/**
 * This methods purpose is to append the item to the list and updates numItems.
 */
    public void add(GroceryItemOrder item) {
        if (numItems < MAX_ITEMS) {
            items[numItems] = item;
            numItems++;
        }
    }
/**
 * This methods purpose is to return the total number of items in the list.
 */
    public int getNumItems() {
        return numItems;
    }
/**
 * This methods purpose is to return the total cost of all the items in the list.
 */
    public double getTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < numItems; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }
/**
 * This methods purpose is to modify the quantity of an item in the list.
 */
    public void modifyItem(int index, int quantity) {
        if (index >= 0 && index < numItems) {
            items[index].setQuantity(quantity);
        }
    }
/**
 * This methods purpose is to return a string representation of all the current items in the list.
 */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numItems; i++) {
            sb.append(items[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
