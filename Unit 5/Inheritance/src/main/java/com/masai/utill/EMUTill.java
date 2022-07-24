package com.masai.utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUTill {

	private static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("Employeeunit1");
	
	}
	public static EntityManager provideEntityManager() {
	
		return emf.createEntityManager();
	
	}
}
