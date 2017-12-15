package ca.utoronto.utsc.grader.gpa;

import java.util.List;
import java.util.Arrays;

import ca.utoronto.utsc.grader.grades.Grade;
import ca.utoronto.utsc.grader.grades.InvalidGradeException;
import ca.utoronto.utsc.grader.grades.LetterGrade;

public class Main {

	public static void main(String[] args) throws InvalidGradeException {
		// TODO Auto-generated method stub
		Grade grade1 = new LetterGrade("A");
		Grade grade2 = new LetterGrade("A-");
		Grade grade3 = new LetterGrade("C");
		
		// create a list using the
        List<Grade> mylist = Arrays.asList(grade1, grade2, grade3);
        
		System.out.printf("The cgpa is %f"
				+ "\n", GpaCalculator.cgpa(mylist));
		
	}

}
