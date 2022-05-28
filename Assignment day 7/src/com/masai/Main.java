package com.masai;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.Name="Anubhav";
		manager.Age=22;
		manager.PhoneNumber="8957107552";
		manager.Address="Kanpur";
		manager.Salary=3000000.0;
		manager.printSalary();
		
		Employee employee = new Employee();
		employee.Name="Nandita";
		employee.Age=22;
		employee.PhoneNumber="8957107552";
		employee.Address="Kakadev";
		employee.Salary=200000.0;
		employee.printSalary();
	}
}

class Member{
	String Name;
	int Age;
	String PhoneNumber;
	String Address;
	double Salary;
	
public void printSalary() {
		System.out.println("Salary: "+Salary);
	}
}
	
class Employee extends Member{
		String Specialisation ;
		String Department ;
		
	}
class Manager extends Employee{
		
	}
