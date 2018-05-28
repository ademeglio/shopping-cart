package org.wecancodeit.shopping_cart;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;


public class Cart {
	List<Item> orders = new ArrayList<>();
	
	// add items to the cart
	public void addItem(Item item) {
		orders.add(item);
	}

	// iterate through items and sum item quantities
	public int getTotalItems() {
		int itemsQty = 0;
		
		for (Item item : orders) {              
			itemsQty += item.getItemQty();
		}

		return itemsQty;
	}

	// remove items from the cart
	public void removeItem(String itemName) {
		for (int i = orders.size() - 1; i >= 0; i--) {
			if (orders.get(i).getItemName().equals(itemName)) {
				orders.remove(i);
			}			
		} // end for
	}

	// total cost of all items in the cart
	public String getTotalCost() {
		double cartTotalCharge = 0;
		
		for (Item item : orders) {
			cartTotalCharge += (item.getItemPrice() * item.getItemQty());
		}
		
		BigDecimal amount = new BigDecimal(cartTotalCharge);
		NumberFormat n = NumberFormat.getCurrencyInstance();
		double doubleAmount = amount.doubleValue();
		String amountToCurrency = n.format(doubleAmount);
		
		return amountToCurrency;
	}
	
	public String getUnitExtendedPrice(Item item) {
		double unitExtendedPrice = item.getItemPrice() * item.getItemQty();
		
		BigDecimal amount = new BigDecimal(unitExtendedPrice);
		NumberFormat n = NumberFormat.getCurrencyInstance();
		double doubleAmount = amount.doubleValue();
		String amountToCurrency = n.format(doubleAmount);
		
		return amountToCurrency;
	}
	
	// traverse and show contents of the cart
	public void showOrder() {
		for (Item item : orders) {
			System.out.println("<ITEM> " + item.getItemName() 
					+ " <UNIT PRICE> $" + item.getItemPrice()
					+ " <QTY> " + item.getItemQty()
					+ " <SUBTOTAL> " + getUnitExtendedPrice(item) );
		}
	}
}
