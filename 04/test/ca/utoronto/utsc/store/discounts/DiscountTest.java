package ca.utoronto.utsc.store.discounts;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DiscountTest {

	@Test
	public void testConstantDiscountgeneral() {
		
		Discount discount = new ConstantDiscount(5);
		
		assertEquals(discount.getDiscountedPrice(7), 2, 0.0001);
		
	}

	@Test
	public void testConstantDiscountNegPrice() {
		
		Discount discount = new ConstantDiscount(10);
		
		assertEquals(discount.getDiscountedPrice(7), -3, 0.0001);
		
	}
	

	@Test
	public void testConstantDiscountDouble() {
		
		Discount discount = new ConstantDiscount(10.5);
		
		assertEquals(discount.getDiscountedPrice(15), 4.5, 0.0001);
		
	}



	@Test
	public void testSeasonalDiscountNoDiscount() {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2015, 11, 15); // Dec 15th 2015
		Date from = calendar.getTime();
		
		calendar.set(2015, 10, 15); // Nov 15th 2015
		Date to = calendar.getTime();


		Discount discount = new SeasonalDiscount(0.2, from, to);
		
		assertEquals(discount.getDiscountedPrice(8.5), 8.5, 0.0001);
	}
	
	
	
	@Test
	public void testSeasonalDiscountOnFrom() {
		//toC stands for to, but is type Calendar
		Calendar toC = Calendar.getInstance();
		toC.add(Calendar.DATE, 5);  // 5 days later
		Date to = toC.getTime();
		
		Calendar fromC = Calendar.getInstance(); //today
		Date from = fromC.getTime();
		
		Discount discount = new SeasonalDiscount(0.2, from, to);
		//apply discount
		assertEquals(discount.getDiscountedPrice(8.5), 6.8, 0.0001);
	}

	
	
	@Test
	public void testSeasonalDiscountAfterFromBeforeTo() {
		
		//toC stands for to, but is type Calendar
				Calendar toC = Calendar.getInstance();
				toC.add(Calendar.DATE, 5);  // 5 days later
				Date to = toC.getTime();
				
				Calendar fromC = Calendar.getInstance();
				toC.add(Calendar.DATE, -1);  // yesterday
				Date from = fromC.getTime();
				
				Discount discount = new SeasonalDiscount(0.2, from, to);
				//apply discount
				assertEquals(discount.getDiscountedPrice(8.5), 6.8, 0.0001);
				
	}
	
	@Test
	public void testSeasonalDiscountOnTo() {
		
		//toC stands for to, but is type Calendar
				Calendar toC = Calendar.getInstance();//today
				Date to = toC.getTime();
				
				Calendar fromC = Calendar.getInstance();
				toC.add(Calendar.DATE, -1);  // yesterday
				Date from = fromC.getTime();
				
				Discount discount = new SeasonalDiscount(0.2, from, to);
				//no discount
				assertEquals(discount.getDiscountedPrice(8.5), 8.5, 0.0001);
				
				
	}
	
	
	@Test
	public void testHappyDayDiscountNoDiscount() {
		
		//toC stands for to, but is type Calendar
				
		int day_of_week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		day_of_week = (day_of_week + 1) % 7; // make it mismatch today
		Discount discount = new HappyDayDiscount(0.3, day_of_week);
		//no discount
		assertEquals(discount.getDiscountedPrice(8.5), 8.5, 0.0001);		
	}
	
	
	@Test
	public void testHappyDayDiscountApplyDiscount() {
		
		//toC stands for to, but is type Calendar
				
		int day_of_week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		Discount discount = new HappyDayDiscount(0.3, day_of_week);
		//no discount
		assertEquals(discount.getDiscountedPrice(8.5), 5.95, 0.0001);		
	}
	
	
	
}
