package com.masai.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class GetAllEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("employeeunit1");
		EntityManager em= emf.createEntityManager();
		
		Employee emp= em.find(Employee.class, 10);
		
		if(emp!=null)
		{
			System.out.println(emp);
		}
		else
		{
			System.out.println("Employee dosen't exits......");
		}
		em.close();
	}
}
