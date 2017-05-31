package co.exercise;

import java.util.List;
import java.util.stream.Stream;

public final class ShoppingCart {

	private final List<Item> items;

	public ShoppingCart(List<Item> items) {
		this.items = items;
	}

	public final Price checkout() {
		Stream<Item> stream = items.stream();
		Price total = stream.collect(Price::new, (result, element) -> result.add(element.getPrice()),
				(result, element) -> result.toString());
		return total;
	}

}
