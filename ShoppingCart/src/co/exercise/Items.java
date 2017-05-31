package co.exercise;

import java.util.HashMap;
import java.util.Map;

public class Items {
	public static final Item APPLE = new Item(new Price(60));
	
	public static final Item ORANGE = new Item(new Price(25));
	
	public static final Map<Item, Offer> OFFERS = new HashMap<Item, Offer>();

	static{
		OFFERS.put(APPLE, new Buy1Get1Free());
		OFFERS.put(ORANGE, new Buy3Get1Free());
	}
}

class Item {
	private Price price;

	Item(Price price) {
		this.price = price;
	}

	public Price getPrice() {
		return price;
	}
}