package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class Main {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Eid:");
		int id = scan.nextInt();
		
		System.out.println("Enter Name:");
		String name = scan.next();
		
		System.out.println("Enter Address:");
		String address = scan.next();
		
		System.out.println("Enter Salary:");
		int salary = scan.nextInt();
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		Employee emp = new Employee(id, name, address, salary);
		
		String msg= dao.saveEmployeeDetails(emp);
		System.out.println(msg);

	}

}
