package ca.utoronto.utsc.grader.grades;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumericGradeTest {

	@Test
	public void testNumericGrade() {
		try {
			Grade numericGrade1 = new NumericGrade(80);
			Grade numericGrade2 = new NumericGrade(30);
			Grade numericGrade3 = new NumericGrade(76);			
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("unexpected exception");
		}
	}

	@Test
	public void testGpa() {
		Grade letterGrade2;
		try {
			letterGrade2 = new NumericGrade(72);
			assertEquals(letterGrade2.gpa(), 2.7, 0.01);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("unexpected exception");
		}
	}

	@Test
	public void testToString() {
		Grade letterGrade2;
		try {
			letterGrade2 = new NumericGrade(72);
			System.out.println(letterGrade2);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("unexpected exception");
		}
	}

}
