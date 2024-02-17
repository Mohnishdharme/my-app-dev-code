//The code Written by me is accidentally got deleted so chatgpt it is  ;)
package com.task.StaticEx2;

public class InventoryItem {
    // Static variable to keep track of total items in stock
    private static int totalItems = 0;
    
    // Instance variables
    private String itemName;
    private int quantity;

    // Constructor
    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        totalItems += quantity; // Increment totalItems when an item is added to inventory
    }

    // Static method to get total items in stock
    public static int getTotalItems() {
        return totalItems;
    }

    // Method to add items to inventory
    public void addToInventory(int quantityToAdd) {
        quantity += quantityToAdd;
        totalItems += quantityToAdd;
    }

    // Method to remove items from inventory
    public void removeFromInventory(int quantityToRemove) {
        if (quantityToRemove <= quantity) {
            quantity -= quantityToRemove;
            totalItems -= quantityToRemove;
        } else {
            System.out.println("Error: Not enough quantity in inventory.");
        }
    }

    // Getter method for itemName
    public String getItemName() {
        return itemName;
    }

    // Getter method for quantity
    public int getQuantity() {
        return quantity;
    }
}