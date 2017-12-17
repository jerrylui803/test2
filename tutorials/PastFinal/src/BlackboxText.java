import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BlackboxText {
	public static final double EPSILON = 0.001;

	@Before
	public void setUp() throws Exception {
		return;

	}

	@Test
	public void testAverageEmptyListException() {
		List<Integer> mylist = new ArrayList<Integer>();
		try {
			Avg.average(mylist);
			fail("Did not throw any expection with empty list");
		} catch (InvalidElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Wrong exception for empty list");
		} catch (NoElementsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}



	@Test
	public void testAverageInvalidElementException() {
		List<Integer> mylist = new ArrayList<Integer>();
		mylist = Arrays.asList(-1);
		try {
			Avg.average(mylist);
			fail("Did not throw any expection with negative element list");
		} catch (InvalidElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (NoElementsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Wrong exception for negative element list");
		}
	}


	@Test
	public void testAverageInvalidElementException2() {
		List<Integer> mylist = new ArrayList<Integer>();
		mylist = Arrays.asList(-9, -62178);
		try {
			Avg.average(mylist);
			fail("Did not throw any expection with negative element list");
		} catch (InvalidElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (NoElementsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Wrong exception for negative element list");
		}
	}



	@Test
	public void testAverageSingleElmtList() {
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(20);
		try {
			double result = Avg.average(mylist);
			assertEquals(result, 20, EPSILON);
		} catch (InvalidElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Unexpected exception");
		} catch (NoElementsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Unexpected exception");
		}
	}
	
	
	@Test
	public void testAverageSingleElmtList2() {
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(0);
		try {
			double result = Avg.average(mylist);
			assertEquals(result, 0, EPSILON);
		} catch (InvalidElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Unexpected exception");
		} catch (NoElementsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Unexpected exception");
		}
	}
	
	
	
	@Test
	public void testAverageTwoElmtList2() {
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(20);
		mylist.add(25);
		try {
			double result = Avg.average(mylist);
			assertEquals(result, 22.5, EPSILON);
		} catch (InvalidElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Unexpected exception");
		} catch (NoElementsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Unexpected exception");
		}
	}

	
	
	
	@Test
	public void testAverageMultipleElmtList2() {
		List<Integer> mylist = Arrays.asList(60, 2, 78, 234, 0, 12);
		try {
			double result = Avg.average(mylist);
			assertEquals(result, 64.3333333333, EPSILON);
		} catch (InvalidElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Unexpected exception");
		} catch (NoElementsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Unexpected exception");
		}
	}




}
