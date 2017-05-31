package co.exercise;

import java.text.NumberFormat;
import java.util.Locale;

public class Price {

	private int value;

	public Price(int value) {
		this.value = value;
	}

	public Price() {
		this(0);
	}

	public int getValue() {
		return value;
	}

	public void add(Price other) {
		this.value += other.getValue();
	}

	@Override
	public String toString() {
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.UK);
		return currencyFormatter.format(value / 100.0);
	}
}
