package org.wecancodeit.shopping_cart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemClassTest {

	@Test
	public void newItemCreationTestName() {
		Item itemTest = new Item("Baseball", 5.56, 1);
		String newItem = itemTest.getItemName();
		assertEquals(newItem, "Baseball");
	}
	
	@Test
	public void newItemCreationTestPrice() {
		Item itemTest = new Item("Baseball", 5.56, 1);
		double newItemPrice = itemTest.getItemPrice();
		assertEquals(newItemPrice, 5.56, 0);
	}
	
	@Test
	public void newItemCreationTestQty() {
		Item itemTest = new Item("Baseball", 5.56, 1);
		int newItemQty = itemTest.getItemQty();
		assertEquals(newItemQty, 1);
	}
	
	@Test
	public void newItemToStringSummary() {
		Item itemTest = new Item("Baseball", 5.56, 1);
		String itemStringSum = itemTest.toString();
		assertEquals(itemStringSum, "ITEM: Baseball    PRICE: 5.56    QUANTITY: 1");
	}
}
