package com.task.StaticEx2;

public class Main {
    public static void main(String[] args) {
        // Create inventory items
        InventoryItem item1 = new InventoryItem("Pen", 50);
        InventoryItem item2 = new InventoryItem("Notebook", 30);

        // Display initial total items
        System.out.println("Total items in stock: " + InventoryItem.getTotalItems());

        // Add items to inventory and update total items
        item1.addToInventory(20);
        item2.addToInventory(10);

        // Display total items after adding
        System.out.println("Total items in stock after adding: " + InventoryItem.getTotalItems());

        // Remove items from inventory and update total items
        item1.removeFromInventory(10);
        item2.removeFromInventory(5);

        // Display total items after removing
        System.out.println("Total items in stock after removing: " + InventoryItem.getTotalItems());
    }
}
