/**
 * 
 */
package ca.utoronto.utsc.store.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import ca.utoronto.utsc.store.discounts.ConstantDiscount;
import ca.utoronto.utsc.store.discounts.Discount;
import ca.utoronto.utsc.store.discounts.HappyDayDiscount;
import ca.utoronto.utsc.store.discounts.SeasonalDiscount;
import ca.utoronto.utsc.store.products.Priced;
import ca.utoronto.utsc.store.products.Product;

/**
 * @author luijerr1
 *
 */
public class PriceCalculatorTest {

	/**
	 * Test method for {@link ca.utoronto.utsc.store.calculator.PriceCalculator#getTotalPrice(java.util.List)}.
	 */
	@Test
	public void testGetTotalPrice() {
		//Note:
		//-------------------------This test should be ran after DiscountTest.java and ProductTest.java----------------------------------------
		//-------------------------This assumes Discounts are applied properly on Product Prices!!!--------------------------------------------
		

	    
	    Discount cd = new MockConstantDiscount(5);
	    
	    PriceCalculator pc1 = new PriceCalculator(cd);
	    
	    Priced usbStick = new Product("234523452345", 35);
	    Priced headphones = new Product("345634563456", 120);
	    Priced dress = new Product("123412341234", 80);
	    
	    List<Priced> stuff = Arrays.asList(new Priced [] {usbStick, headphones, dress});
	    // if discount class is correct, then I don't have to test for failure using other discounts
	    // since the priceCalculator doesn't care which discount is being applied. 
	    assertEquals(pc1.getTotalPrice(stuff), 220.00, 0.0001);
	  
	}
	
	
	
	@Test
	public void testGetTotalPrice2() {
		//Note:
		//Making sure there aren't hard coding in calculator
		
		Calendar calendar = Calendar.getInstance();
	    calendar.set(2015, 10, 15); // Nov 15th 2015
	    Date from = calendar.getTime();
	    calendar.set(2015, 11, 15); // Dec 15th 2015
	    Date to = calendar.getTime();

	    Discount sd = new SeasonalDiscount(0.2, from, to);
	    
	    PriceCalculator pc2 = new PriceCalculator(sd);
	    
	    Priced usbStick = new Product("234523452345", 35);
	    Priced headphones = new Product("345634563456", 120);
	    Priced dress = new Product("123412341234", 80);
	    
	    List<Priced> stuff = Arrays.asList(new Priced [] {usbStick, headphones, dress});
	    // if discount class is correct, then I don't have to test for failure using other discounts
	    // since the priceCalculator doesn't care which discount is being applied. 
	    assertEquals(pc2.getTotalPrice(stuff), 235.00, 0.0001);
	    // making sure there isn't some kind of hard coding in priceCalculator that tells it to use only one type of discount
	}
	
}
