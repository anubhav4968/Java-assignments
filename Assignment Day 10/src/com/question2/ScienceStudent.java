package com.question2;

public class ScienceStudent extends Student{

	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	public ScienceStudent(int phisicsMarks, int chemistryMarks, int mathsMarks) {
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public int getPercentage() {
		
		int total =( (phisicsMarks + chemistryMarks + mathsMarks)/3);
//		System.out.println(total);
		return total;
	}
	
}
