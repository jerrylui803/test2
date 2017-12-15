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

		Grade grade1;
		Grade grade2;
		Grade grade3;
		try {
			grade1 = new MockLetterGrade("A");
			grade2 = new MockLetterGrade("A-");
			grade3 = new MockLetterGrade("C");
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Unexpected Exception");
			return;
		}

		List<Grade> mylist = Arrays.asList(grade1, grade2, grade3);

		double cgpa = GpaCalculator.cgpa(mylist);

		assertEquals(cgpa, 3.2333,0.01);
	}
	
	
	
	@Test
	public void testCgpaNumerical() {

		Grade grade1;
		Grade grade2;
		Grade grade3;
		try {
			grade1 = new MockNumericGrade(90);
			grade2 = new MockNumericGrade(78);
			grade3 = new MockNumericGrade(83);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Unexpected Exception");
			return;
		}

		List<Grade> mylist = Arrays.asList(grade1, grade2, grade3);

		double cgpa = GpaCalculator.cgpa(mylist);
		//System.out.println(cgpa);
		assertEquals(cgpa, 3.66,0.01);
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
			grade1 = new MockLetterGrade("A");
			grade2 = new MockLetterGrade("A-");
			grade3 = new MockLetterGrade("C");
			grade4 = new MockNumericGrade(90);
			grade5 = new MockNumericGrade(78);
			grade6 = new MockNumericGrade(83);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Unexpected Exception");
			return;
		}

		List<Grade> mylist = Arrays.asList(grade1, grade4, grade3, grade5, grade6, grade2);

		double cgpa = GpaCalculator.cgpa(mylist);
		//System.out.println(cgpa);
		assertEquals(cgpa, 3.45,0.01);

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
			e.printStackTrace();
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
