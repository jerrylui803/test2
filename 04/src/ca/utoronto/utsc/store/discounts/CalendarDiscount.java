package ca.utoronto.utsc.store.discounts;

public abstract class CalendarDiscount implements Discount {
	private double discountRate;
	
	
	public CalendarDiscount(double rate) {
		discountRate = rate;
	}
	
	@Override
	public double getDiscountedPrice(double price) {
		// TODO Auto-generated method stub
		if(isApplicableToday()) {
			return (1 - discountRate) * price;
		}
		else {
			return price;
		}
	}	
	
	abstract boolean isApplicableToday();
	
}
