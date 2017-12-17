package ca.utoronto.utsc.grader.gpa;

import ca.utoronto.utsc.grader.grades.Grade;
import ca.utoronto.utsc.grader.grades.InvalidGradeException;

public class MockNumericGrade implements Grade{

	// numeric grade
	private int score;  

	/**
	 * Creates a new <code>Grade</code> with the given value.
	 * @param score the numeric value of the new <code>Grade</code>, 
	 *     must be in the range [0, 100].
	 * @throws InvalidGradeException if grade is not in [0, 100]
	 */
	public MockNumericGrade(int score) throws InvalidGradeException {
		return;
	}


	@Override
	public double gpa() {
		return 2.7;
	}



}
