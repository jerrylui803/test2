package ca.utoronto.utsc.grader.gpa;

import ca.utoronto.utsc.grader.grades.Grade;
import ca.utoronto.utsc.grader.grades.InvalidGradeException;

public class MockLetterGrade2 implements Grade {
	//3.7 gpa
	//A-
	
	public MockLetterGrade2(String grade) throws InvalidGradeException {
		return;
	}
	@Override
	public double gpa() {
		// TODO Auto-generated method stub
		return 3.7;
	}
	public String toString() {
		return String.format("A-");
	}

}
