package ca.utoronto.utsc.grader.grades;

import static org.junit.Assert.*;

import org.junit.Test;

public class LetterGradeTest {

	@Test
	public void testLetterGrade() {
		
		try {
			Grade letterGrade1 = new LetterGrade("A");
			Grade letterGrade2 = new LetterGrade("B-");
			Grade letterGrade3 = new LetterGrade("C+");			
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
			letterGrade2 = new LetterGrade("B-");
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
			letterGrade2 = new LetterGrade("B-");
			System.out.println(letterGrade2);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("unexpected exception");
		}
		
	}

}
