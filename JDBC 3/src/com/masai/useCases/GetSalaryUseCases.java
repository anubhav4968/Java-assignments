package com.masai.useCases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class GetSalaryUseCases {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Eid :");
		int eid = scan.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			int salary = dao.getSalaryByEid(eid);
			
			System.out.println("Employee salary is : "+salary);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
