package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("AccountUnit1");
	}

	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}
