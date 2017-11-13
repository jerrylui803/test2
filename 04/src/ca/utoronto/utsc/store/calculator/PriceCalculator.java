package ca.utoronto.utsc.store.calculator;

import java.util.List;

import ca.utoronto.utsc.store.discounts.Discount;
import ca.utoronto.utsc.store.products.Priced;

public class PriceCalculator {
	private Discount discount;

	public PriceCalculator(Discount discount) {
		this.discount = discount;
	}
	
	
	public double getTotalPrice(List<Priced> items) {
		double sum = 0;
		for(Priced item : items) {
			sum = sum + this.discount.getDiscountedPrice(item.getPrice());
		}
		return sum;
	}
	
	
	
	
}
