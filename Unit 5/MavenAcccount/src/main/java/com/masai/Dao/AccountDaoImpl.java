package com.masai.Dao;

import javax.persistence.EntityManager;

import com.masai.entity.Account;
import com.masai.util.EMUUtil;

public class AccountDaoImpl implements AccountDao{

	@Override
	public boolean createAccount(Account account) {
		Boolean flag = false;
		
		EntityManager em =EMUUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(account);
		flag=true;
		em.getTransaction().commit();
		em.close();
		
		return flag;
	}

	@Override
	public boolean deleteAccount(int accno) {
		Boolean flag = false;
		EntityManager em = EMUUtil.provideEntityManager();
		Account ac= em.find(Account.class, accno);
		if(ac!=null)
		{
			em.getTransaction().begin();
			em.remove(ac);
			flag=true;
			em.getTransaction().commit();
		}
		em.close();
		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {
		boolean flag= false;
		
		EntityManager em = EMUUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.merge(account);
		flag=true;
		em.getTransaction().commit();
		em.close();
		
		return flag;
	}

	@Override
	public Account findAccount(int accno) {
		
		return EMUUtil.provideEntityManager().find(Account.class, accno);
	}

}
