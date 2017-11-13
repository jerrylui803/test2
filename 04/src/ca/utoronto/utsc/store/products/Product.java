package ca.utoronto.utsc.store.products;

public class Product implements Priced {
	private double price;
	private String isbn;
	
	public Product(String isbn, double price) {
		this.isbn = isbn;
		this.price = price;
		
	}
	
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
