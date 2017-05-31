package co.exercise;

public class Items {
	public static final Item APPLE = new Item(new Price(60));
	
	public static final Item ORANGE = new Item(new Price(25));
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