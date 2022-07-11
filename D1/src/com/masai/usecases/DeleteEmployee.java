package com.masai.usecases;

import java.util.Scanner;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Empid:");
		int empid = sc.nextInt();
		
        EmployeeDao empdao = new EmployeeDaoImpl();
		
		try {
			String emp = empdao.deleteEmployee(empid);
			System.out.println(emp);
		}catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
