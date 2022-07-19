package com.masai.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class DeleteEmpById {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("employeeunit1");
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id to delete");
		int id = sc.nextInt();
		
		Employee emp = em.find(Employee.class, id);
		if(emp !=null)
		{
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			
		}
		else {
			System.out.println("Employee does not exits.....");
		}
		em.close();
		System.out.println("Done.....");
	}
}
