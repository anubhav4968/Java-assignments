package com.masai;

public class displayStudentDetails {
    int roll;
    
    String name;
    
    int marks;
	
	public static void main(String[] args) {
	  
		displayStudentDetails Student1 = new displayStudentDetails();
		
		Student1.roll = 1;
		
		Student1.name="Anubhav MIshra";
		
		Student1.marks = 85;
		
		System.out.println("Roll is:" + Student1.roll);
		
		System.out.println("Name is:" + Student1.name);
		
		System.out.println("Marks is :"+ Student1.marks );

		displayStudentDetails Student2 = new displayStudentDetails();
		
		Student2.roll = 2;
		
		Student2.name = "Anupam Mishra";
		
		Student2.marks = 89;
		
        System.out.println("Roll is:" + Student2.roll);
		
		System.out.println("Name is:" + Student2.name);
		
		System.out.println("Marks is :"+ Student2.marks );
		
		Student1 = null;
		
		Student2 = null;
		
		System.out.println(Student1);
		
		System.out.println(Student2);
	}
	

}
