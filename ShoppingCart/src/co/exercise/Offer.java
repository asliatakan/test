package co.exercise;

import java.util.List;

public interface Offer {
	Price getOffer(List<Item> cart, Item item);
}
