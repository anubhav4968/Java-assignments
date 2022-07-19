package com.masai.UTill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMU_utill {

	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("employeeunit1");
		
	}
	public static EntityManager provideEntityManager() {
		
		return emf.createEntityManager();
	}
}
