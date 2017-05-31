package co.exercise;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public final class ShoppingCart {

	private final List<Item> items;

	public ShoppingCart(List<Item> items) {
		this.items = Objects.requireNonNull(items);
	}

	public final Price checkout() {
		Stream<Item> stream = items.stream();
		Price total = stream.collect(Price::new, (result, element) -> result.add(element.getPrice()),
				(result, element) -> result.toString());
		Price offers = Items.OFFERS.entrySet().stream().collect(Price::new,
				(result, element) -> result.add(element.getValue().getOffer(items, element.getKey())),
				(result, element) -> result.toString());
		return total.minus(offers);

	}

}
