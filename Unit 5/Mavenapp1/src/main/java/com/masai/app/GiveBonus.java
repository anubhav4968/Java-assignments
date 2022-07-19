package com.masai.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class GiveBonus {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("employeeunit1");
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id To Give Bonus: ");
		int id = sc.nextInt();
		
		Employee emp = em.find(Employee.class, id);
		if(emp!=null)
		{
			System.out.println("Enter Bonus:");
			int bonus = sc.nextInt();
			em.getTransaction().begin();
		    emp.setSalary(emp.getSalary()+bonus);
		    em.getTransaction().commit();
		}
		else
		{
			System.out.println("Employee does not exits...");
		}

		em.close();
		System.out.println("Done.....");
	}

}
