package org.wecancodeit.shopping_cart;

import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		
		boolean isDonePurchasing = false;
		Scanner userInput = new Scanner(System.in);
		Cart userCart = new Cart();
		String response = "";
		
		// Create Items() and add to Cart()
		while (!isDonePurchasing) {
			// create item being purchases: name, price, qty
			System.out.println("Enter the name of the item: ");
			String itemName = userInput.next();
			
			System.out.println("Enter the unit pric: ");
			double itemUnitPrice = userInput.nextDouble();
			
			System.out.println("Enter quantity to purchase: ");
			int itemQty = userInput.nextInt();
			
			// build and add item to cart
			userCart.addItem(new Item(itemName, itemUnitPrice, itemQty));
			userInput.nextLine(); // stop input until next input request.
			
			// display current cart contents
			System.out.println("Current Cart:");
			userCart.showOrder();
			System.out.println("Total Price: " + userCart.getTotalItems());
			
			// continue or end purchasing loop
			System.out.println("\nContinue Shopping (y/n)?");
			response = userInput.nextLine();
			if (response.toLowerCase().equals("n") || response.toLowerCase().equals("no")) {
				isDonePurchasing = true;
			}
			
		} // end purchasing loop
		
		

		
		// TODO Option to remove items from cart
		
		
		userInput.close();
	}

}
