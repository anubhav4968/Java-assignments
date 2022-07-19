package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entity.Address;
import com.masai.entity.Employee;
import com.masai.util.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = new Employee();
//		emp.setGender("Male");
//		emp.setName("Anubhav");
//		emp.setSalary(96263);
//		
//		Address homeadr = new Address("Uttar Pradesh", "Kanpur", "208001", "Home");
//		Address offaddr = new Address("Maharastra", "Mumbai","6753", "Office");
		
//		emp.setGender("Male");
//		emp.setName("Brijesh");
//		emp.setSalary(99493);
//		
//		Address homeadr = new Address("Uttar Pradesh", "Varanasi", "808001", "Home");
//		Address offaddr = new Address("Maharastra", "Mumbai","6758", "Office");
		
//		emp.setGender("Female");
//		emp.setName("Sakshi");
//		emp.setSalary(15432);
//		
//		Address homeadr = new Address("Uttar Pradesh", "Bareli", "83931", "Home");
//		Address offaddr = new Address("West Bengal", "Kolkata","6753", "Office");
		
		
		emp.setGender("Female");
		emp.setName("Anudita");
		emp.setSalary(184752);
		
		Address homeadr = new Address("Uttar Pradesh", "Kanpur", "20027", "Home");
		Address offaddr = new Address("Maharashtra", "Mumbai","6753", "Office");
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("Done....");
		em.close();

	}

}
