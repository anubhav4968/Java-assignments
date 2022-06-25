package com.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
	
		List <Student> al = new ArrayList<>();
		al.add(new Student(10,"Anubhav",840));
		al.add(new Student(12,"Nandita",740));
		al.add(new Student(14,"Anudita",640));
		al.add(new Student(18,"Brijesh",940));
		al.add(new Student(19,"Chandni",240));
		al.add(new Student(3,"Sakshi",589));
		
		List <Student> std=al.stream().filter(s->s.getMarks()<800).collect(Collectors.toList());
		System.out.println(std);
	}
}
