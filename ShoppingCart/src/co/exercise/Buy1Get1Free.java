package co.exercise;

import java.util.List;

public class Buy1Get1Free implements Offer {

	@Override
	public Price getOffer(List<Item> cart, Item item) {
		long count = cart.stream().filter(t -> item.equals(t)).count();
		if (count > 0) {
			return item.getPrice().multiply(count / 2);
		} else
			return new Price();
	}

}
