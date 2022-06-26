package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.question1.Student;

public class Main {
		public static void main(String[] args) {
			
			List <Student> al = new ArrayList<>();
			al.add(new Student(10,"Anubhav",840));
			al.add(new Student(12,"Nandita",740));
			al.add(new Student(14,"Anudita",640));
			al.add(new Student(18,"Brijesh",940));
			al.add(new Student(19,"Chandni",240));
			al.add(new Student(3,"Sakshi",589));
			Employee em = new Employee();
//			System.out.println(al);
			List<Integer> std=al.stream().map(s ->(s.getMarks()*1000)).collect(Collectors.toList());
			std.forEach(e -> {
				
			    
			    em.setSalary(e);
			    });
//			System.out.println(std);
			
			int i=0;
			for(Student a:al)
		    {
		    	em.setEmpId(a.getRollNo());
		    	em.setEmpName(a.getStudentName());
		    	em.setSalary(std.get(i));
		    	i++;
		    	System.out.println(em);
		    }
		
			
	}
}
