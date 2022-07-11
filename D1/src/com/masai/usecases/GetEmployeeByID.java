package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class GetEmployeeByID {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Eid:");
		int empid = scan.nextInt();
		
		EmployeeDao empdao = new EmployeeDaoImpl();
		
		try {
			Employee emp = empdao.getEmployeeById(empid);
			System.out.println(emp);
		}catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
