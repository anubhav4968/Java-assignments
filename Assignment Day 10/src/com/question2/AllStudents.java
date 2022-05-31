package com.question2;
import java.util.Scanner;
public class AllStudents {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String name = scan.next();
		
		
		System.out.println("Enter Address");
		String address = scan.next();
		
		
		System.out.println("Enter physicsMarks");
		int physics = scan.nextInt();
		System.out.println("Enter chemistryMarks");
		int chemistry = scan.nextInt();
		System.out.println("Enter mathsMarks");
		int maths = scan.nextInt();	
		ScienceStudent student = new ScienceStudent(physics,chemistry,maths);
		student.setName(name);
		student.setAddress(address);
		int per1=student.getPercentage();
		System.out.println("Name:"+student.getName());
		System.out.println("Address:"+student.getAddress());
		System.out.println("Percentage of Science Student:"+per1+'%');
		System.out.println("=========================");
		System.out.println(" ");

		
		
		System.out.println("Enter historyMarks");
		int hisotry = scan.nextInt();
		System.out.println("Enter civicsMarks");
		int cicics = scan.nextInt();

		String name2 = scan.next();
		System.out.println("Enter Address");
		String address2 = scan.next();
		System.out.println("Enter Student Name");
		HistoryStudent history = new HistoryStudent(hisotry,cicics);
		history.setAddress(address2);
		history.setName(name2);
		int per=history.getPercentage();
		
		System.out.println("Name:"+student.getName());
		System.out.println("Address:"+student.getAddress());
		System.out.println("Percentage of History Studrnt:"+per+"%");
		
		

	}

}
