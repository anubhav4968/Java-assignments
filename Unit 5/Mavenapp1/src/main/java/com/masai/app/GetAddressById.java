package com.masai.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class GetAddressById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("employeeunit1");
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id of employee");
		int id = sc.nextInt();
		
		Employee emp = em.find(Employee.class, id);
		if(emp !=null)
		{
			System.out.println("Address is: "+emp.getAddress());
		}
		else
		{
			System.out.println("Employee dose not exits.....");
		}
		em.close();
		
	}
}
