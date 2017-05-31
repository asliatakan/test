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
		assertEquals(emptyCart.checkout(), 0);
		assertEquals(oneCart.checkout(), 85);
		assertEquals(manyCart.checkout(), 230);
	}

}
