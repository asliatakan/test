package co.exercise;

public class Items {
	public static final Item APPLE = new Item(60);
	
	public static final Item ORANGE = new Item(25);
}

class Item {
	private int price;

	public Item(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}