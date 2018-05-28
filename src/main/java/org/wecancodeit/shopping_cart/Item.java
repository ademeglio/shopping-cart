package org.wecancodeit.shopping_cart;

public class Item {
	// Instance
	private String name;
	private double price;
	private int quantity;
	
	// Constructor
	public Item(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.quantity = qty;
	}

	// Getters
	public String getItemName() {
		return name;
	}

	public double getItemPrice() {
		return price;
	}

	public int getItemQty() {
		return quantity;
	}
	
	
	// Setters

	// Methods
	public String toString() {
		String itemString = "ITEM: " + name + "    PRICE: " + price
				+ "    QUANTITY: " + quantity;
		return itemString;
	}
}
