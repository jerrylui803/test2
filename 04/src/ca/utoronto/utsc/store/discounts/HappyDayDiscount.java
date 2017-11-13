package ca.utoronto.utsc.store.discounts;

import java.util.Calendar;

public class HappyDayDiscount extends CalendarDiscount implements Discount {
	private int happyDay;
	
	public HappyDayDiscount(double rate, int day) {
		super(rate);
		this.happyDay = day;
	}
	
	@Override
	boolean isApplicableToday() {
		// TODO Auto-generated method stub
		int day_of_week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		return day_of_week == this.happyDay;
	}

}
