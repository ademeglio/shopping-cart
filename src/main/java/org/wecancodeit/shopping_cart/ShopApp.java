package org.wecancodeit.shopping_cart;

import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		
		boolean isDonePurchasing = false;
		Scanner userInput = new Scanner(System.in);
		Cart userCart = new Cart();
		String response = "";
		
// Purchasing Loop
		while (!isDonePurchasing) {
			// create item being purchases: name, price, qty
			System.out.println("Enter the name of the item: ");
			String itemName = userInput.next();
			
			System.out.println("Enter the unit price: ");
			double itemUnitPrice = userInput.nextDouble();
			
			System.out.println("Enter quantity to purchase: ");
			int itemQty = userInput.nextInt();
			
			// build and add item to cart
			userCart.addItem(new Item(itemName, itemUnitPrice, itemQty));
			userInput.nextLine(); // stop input until next input request.
			
			// display current cart contents
			CurrentCart(userCart);
			
			// continue or end purchasing loop
			System.out.println("\nContinue Shopping (y/n)?");
			response = userInput.nextLine();
			if (response.toLowerCase().equals("n") || response.toLowerCase().equals("no")) {
				isDonePurchasing = true;
			}
			
		} // end purchasing loop
		
// Option to remove items from cart loop
		// reset variables
		isDonePurchasing = false;
		response = "";
		
		while (!isDonePurchasing) {
						
			System.out.println("Do you want to remove anything from the cart?");
			response = userInput.nextLine();
			if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")) {
				System.out.println("What do you want to remove?");
				response = userInput.nextLine();
				userCart.removeItem(response);
			} else if (response.toLowerCase().equals("n") || response.toLowerCase().equals("no")) {
				isDonePurchasing = true;
			}
			
			CurrentCart(userCart);
		}

		userInput.close();
		System.out.println("\nProceeding to checkout...\nShopApp-fin!");
	}

	public static void CurrentCart(Cart userCart) {
		System.out.println("Current Cart:");
		userCart.showOrder();
		System.out.println("CART TOTAL: " + userCart.getTotalCost());
	}
}
