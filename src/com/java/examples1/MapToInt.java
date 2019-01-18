package com.java.examples1;

import java.util.ArrayList;
import java.util.List;

public class MapToInt {

	public static void main(String args[]) {

		final Item item1 = new Item();
		item1.setName("Sugar");
		item1.setQuantity(3);

		final Item item2 = new Item();
		item2.setName("Tea");
		item2.setQuantity(4);

		final List<Item> listItems = new ArrayList<Item>();
		listItems.add(item1);
		listItems.add(item2);

		final int sum = listItems.stream().mapToInt(Item::getQuantity).sum();
		System.out.println(sum);

	}

}
