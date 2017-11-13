package ca.utoronto.utsc.store.discounts;
import java.util.Calendar;
import java.util.Date;

public class SeasonalDiscount extends CalendarDiscount implements Discount {
	private Date form;
	private Date to;
	public SeasonalDiscount(double rate, Date form, Date to) {
		super(rate);
		this.form = form;
		this.to = to;
		
	}
	
	
	@Override
	public boolean isApplicableToday() {
		// TODO Auto-generated method stub
		Date curr_date = Calendar.getInstance().getTime();
		return ((curr_date.after(this.form) || curr_date.equals(this.form)) && curr_date.before(this.to));
			
	}
	
	

}
