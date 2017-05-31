package co.exercise;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {
	private ShoppingCart emptyCart, oneCart, manyCart;
	private Item apple = Items.APPLE;
	private Item orange = Items.ORANGE;

	@Before
	public void setUp() throws Exception {
		emptyCart = new ShoppingCart(Arrays.asList());
		oneCart = new ShoppingCart(Arrays.asList(apple, orange));
		manyCart = new ShoppingCart(Arrays.asList(apple, orange, apple, apple, orange));
	}

	@Test
	public void test() {
		assertEquals(emptyCart.checkout().getValue(), 0);
		assertEquals(emptyCart.checkout().toString(), "£0.00");
		
		assertEquals(oneCart.checkout().getValue(), 85);
		assertEquals(oneCart.checkout().toString(), "£0.85");
		
		assertEquals(manyCart.checkout().getValue(), 230);
		assertEquals(manyCart.checkout().toString(), "£2.30");
	}

}
