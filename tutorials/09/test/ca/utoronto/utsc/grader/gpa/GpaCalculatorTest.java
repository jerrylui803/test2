package ca.utoronto.utsc.grader.gpa;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import ca.utoronto.utsc.grader.grades.Grade;
import ca.utoronto.utsc.grader.grades.InvalidGradeException;
import ca.utoronto.utsc.grader.grades.LetterGrade;
import ca.utoronto.utsc.grader.grades.NumericGrade;

public class GpaCalculatorTest {

	@Test
	public void testCgpaLetter() {

		Grade grade1; // this cannot set to mock grade, because gpacalculator only works with grade
		Grade grade2;
		Grade grade3;
		try {
			grade1 = new MockLetterGrade("C+"); // doesnt have to be C+
			grade2 = new MockLetterGrade2("A-");
			grade3 = new MockLetterGrade("C+");
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Unexpected Exception");
			return;
		}

		List<Grade> mylist = Arrays.asList(grade1, grade2, grade3);

		double cgpa = GpaCalculator.cgpa(mylist);

		assertEquals(cgpa, 2.766,0.01);
	}
	
	
	
	@Test
	public void testCgpaNumerical() {

		Grade grade1; // this cannot set to mock grade, because gpacalculator only works with grade
		Grade grade2;
		Grade grade3;
		try {
			grade1 = new MockNumericGrade(12); 
			grade2 = new MockNumericGrade2(89);
			grade3 = new MockNumericGrade(1234565432);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Unexpected Exception");
			return;
		}

		List<Grade> mylist = Arrays.asList(grade1, grade2, grade3);

		double cgpa = GpaCalculator.cgpa(mylist);
		
		//(2.7+3.3+2.7)/3= 2.9
		assertEquals(cgpa, 2.9, 0.01);
	}
	
	
	
	
	@Test
	public void testCgpaLetterAndNumerical() {

		Grade grade1;
		Grade grade2;
		Grade grade3;
		Grade grade4;
		Grade grade5;
		Grade grade6;
		try {
			grade1 = new MockLetterGrade("C+"); // doesnt have to be C+
			grade2 = new MockLetterGrade2("A-");
			grade3 = new MockLetterGrade("C+");
			grade4 = new MockNumericGrade(12); 
			grade5 = new MockNumericGrade2(89);
			grade6 = new MockNumericGrade(1234565432);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Unexpected Exception");
			return;
		}

		List<Grade> mylist = Arrays.asList(grade1, grade4, grade3, grade5, grade6, grade2);

		double cgpa = GpaCalculator.cgpa(mylist);
		//System.out.println(cgpa);
		assertEquals(cgpa, 2.833,0.01);

	}
	
	
	
	
	@Test
	public void testInvalidGradeException() {

		Grade grade1;
		Grade grade2;
		try {
			grade1 = new LetterGrade("nsfjllwknvnlkaevnk.");
			grade2 = new NumericGrade(213464543);
			fail("did not throw invalid grade exception");
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return;
			
		}

	}
	
	
	/*
	@Test
	public void testNoGradeException() {

		Grade grade1;
		Grade grade2;
		
			GpaCalculator.cgpa(new ArrayList<Grade>());
			fail("did not throw invalid grade exception");
	
	}
	*/
	
}
