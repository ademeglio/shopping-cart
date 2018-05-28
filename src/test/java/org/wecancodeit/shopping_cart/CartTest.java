package org.wecancodeit.shopping_cart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {

	@Test
	public void shouldReturnTotalItemsAsOne() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("", 1.99, 1));
		int itemsQty = underTest.getTotalItems();
		
		assertEquals(1, itemsQty);
		
	}
	
	@Test
	public void shouldReturnTotalItemsAsTwo() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("alternator", 15.50, 1));
		underTest.addItem(new Item("plug", 1.50, 2));
		int itemsQty = underTest.getTotalItems();
		
		assertEquals(3, itemsQty);
	}
	
	@Test
	public void shouldReturnTotalItemsAsOneAfterRemovingItem() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("alternator", 15.50, 1));
		underTest.addItem(new Item("plug", 1.50, 2));
		underTest.removeItem("plug");
		int itemsQty = underTest.getTotalItems();
		
		assertEquals(1, itemsQty);
	}
	
	@Test
	public void shouldReturnTotalCostOfCartItems() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("alternator", 15.51, 1));
		underTest.addItem(new Item("plug", 1.50, 2));
		String itemsCost = underTest.getTotalCost();
		
		assertEquals("$18.51", itemsCost);
	}
	
	@Test
	public void shouldReturnTotalCostOfCartItemsTest2() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("alternator", 15.51, 3));
		underTest.addItem(new Item("plug", 1.53, 2));
		String itemsCost = underTest.getTotalCost();
		
		assertEquals("$49.59", itemsCost);
	}
} //end cart class
