package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetNameAndAddress {

	public static void main(String[] args) {
		 EmployeeDao emp = new EmployeeDaoImpl();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Id of employee");
			int id = sc.nextInt();

			String mes= emp.getNameAndAddress(id);
			System.out.println(mes);
	}
}
