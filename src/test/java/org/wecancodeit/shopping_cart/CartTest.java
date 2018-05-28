package org.wecancodeit.shopping_cart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {

	@Test
	public void shouldReturnTotalItemsAsOne() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("", 1.99, 1));
		int itemsTotal = underTest.getTotalItems();
		
		assertEquals(itemsTotal, 1);
		
	}
}
