package co.exercise;

import java.util.List;

public final class ShoppingCart {

	private final List<Item> items;
	
	public ShoppingCart(List<Item> items) {
		this.items = items;
	}

	public final int checkout() {
		return items.stream().mapToInt(i->i.getPrice()).sum();
	}

}
