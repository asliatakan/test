package co.exercise;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Buy3Get1FreeTest {
	private Item apple = Items.APPLE;
	private Item orange = Items.ORANGE;
	private Buy3Get1Free offer = new Buy3Get1Free();

	@Test
	public void test() {
		assertEquals(offer.getOffer(Arrays.asList(), apple).getValue(), 0);
		assertEquals(offer.getOffer(Arrays.asList(apple), apple).getValue(), 0);
		assertEquals(offer.getOffer(Arrays.asList(apple, apple, apple, orange), apple).getValue(), 60);
		assertEquals(offer.getOffer(Arrays.asList(apple, apple, apple, apple), apple).getValue(), 60);
		assertEquals(offer.getOffer(Arrays.asList(apple, apple, apple, apple), orange).getValue(), 0);
	}

}
