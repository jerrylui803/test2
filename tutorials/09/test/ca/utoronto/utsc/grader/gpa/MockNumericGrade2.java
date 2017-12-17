package ca.utoronto.utsc.grader.gpa;

import ca.utoronto.utsc.grader.grades.Grade;
import ca.utoronto.utsc.grader.grades.InvalidGradeException;

public class MockNumericGrade2 implements Grade {
	
	public MockNumericGrade2(int score) throws InvalidGradeException {
		return;
	}

	
	//3.3gpa
	@Override
	public double gpa() {
		// TODO Auto-generated method stub
		return 3.3;
	}

}
