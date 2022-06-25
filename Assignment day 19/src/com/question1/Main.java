package com.question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		HashMap <String,Student> hm = new HashMap<>();
		hm.put("Maharashtra", new Student(1,"Anubhav",340));
		hm.put("Delhi", new Student(5,"Brijesh",450));
		hm.put("Tamilnadu", new Student(4,"Sakshi",320));
		hm.put("UttarPradesh", new Student(5,"Chandni",550));
		hm.put("Bihar", new Student(9,"Nandita",600));
		
		Collection <Student> students = hm.values();
		List<Student> student = new ArrayList<>(students);
		Collections.sort(student,new SortByMarks());

		for(Student s:student)
		{
			System.out.println("Roll: "+s.getRoll());
			System.out.println("Name: "+s.getName());
			System.out.println("Marks:"+s.getMarks());
			System.out.println("=======================");
		}
		

		
	}
}