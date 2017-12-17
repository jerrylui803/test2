package ca.utoronto.utsc.grader.gpa;

import java.util.Arrays;

import ca.utoronto.utsc.grader.grades.Grade;
import ca.utoronto.utsc.grader.grades.InvalidGradeException;

public class MockLetterGrade implements Grade {
	//2.3 gpa 
	//C+
	
	
	public MockLetterGrade(String grade) throws InvalidGradeException {
		return;
	}

	public double gpa(){
		return 2.3;
	}
	public String toString() {
		return String.format("C+");
	}
}
