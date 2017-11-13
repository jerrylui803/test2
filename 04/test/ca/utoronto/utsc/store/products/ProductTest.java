package ca.utoronto.utsc.store.products;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void testConstructor() {
		Priced usbStick = new Product("234523452345", 35.12345);
		assertEquals(usbStick.getPrice(), 35.12345, 0.0000001);
	}
	@Test
	public void testConstructorZeroPrice() {
		Priced usbStick = new Product("234523452345", 0);
		assertEquals(usbStick.getPrice(), 0, 0.0000001);
	}

}
