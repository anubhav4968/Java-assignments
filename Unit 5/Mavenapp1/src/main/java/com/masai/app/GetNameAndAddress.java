package com.masai.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class GetNameAndAddress {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("employeeunit1");
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of Employee:");
		int id = sc.nextInt();
		
		Employee emp = em.find(Employee.class, id);
		if(emp !=null)
		{
			System.out.println("Name is: "+emp.getName());
			System.out.println("Address is: "+emp.getAddress());
		}
		else
		{
			System.out.println("Emoloyee does not found.....");
		}
	}
}
