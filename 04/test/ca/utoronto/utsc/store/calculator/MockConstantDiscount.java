package ca.utoronto.utsc.store.calculator;

import ca.utoronto.utsc.store.discounts.Discount;

public class MockConstantDiscount implements Discount{
	
	
	public MockConstantDiscount(double amount) {
		return;
	}
	
	@Override
	public double getDiscountedPrice (double price) {
		// This mock method has the constant discount set as 5
		return price - 5;
	}


}
