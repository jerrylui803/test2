package ca.utoronto.utsc.store.discounts;

public class ConstantDiscount implements Discount {
	private double amount;
	
	public ConstantDiscount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public double getDiscountedPrice (double price) {
		// TODO Auto-generated method stub
		return price - amount;
	}

}
