package com.masai.main;


import javax.persistence.EntityManager;

import com.masai.entity.Address;
import com.masai.entity.Employee;
import com.masai.utill.EMUTill;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = EMUTill.provideEntityManager();
		
		
		Employee emp1 = new Employee();
		emp1.setName("Anubhav");
		emp1.setHomeAddress(new Address("Up", "Kanpur", "208001"));
		emp1.setOfficeAddress(new Address("Karnatka", "Banglore", "12345"));
		emp1.setSalary(1234532);
		
		Employee emp2 = new Employee();
		emp2.setHomeAddress(new Address("Up", "Varanasi", "52653"));
		emp2.setOfficeAddress(new Address("Karnatka", "Banglore", "12345"));
		emp2.setName("Brijesh");
		emp2.setSalary(924763);
		
		Employee emp3 = new Employee();
		emp3.setHomeAddress(new Address("Up", "Allahabad", "52653"));
		emp3.setOfficeAddress(new Address("Maharashtra", "Mumbai", "12345"));
		emp3.setName("Chandni");
		emp3.setSalary(924723);
		
		Employee emp4 = new Employee();
		emp4.setHomeAddress(new Address("Up", "Varanasi", "52653"));
		emp4.setOfficeAddress(new Address("Karnatka", "Banglore", "12345"));
		emp4.setName("Sakshi");
		emp4.setSalary(424763);
		
		
		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp4);
		em.persist(emp3);
		em.persist(emp2);

		em.getTransaction().commit();
		System.out.println("Done......");
	}

}
