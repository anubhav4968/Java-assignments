package com.masai.usecases;

import java.util.Scanner;

import com.masai.Dao.AccountDao;
import com.masai.Dao.AccountDaoImpl;
import com.masai.entity.Account;

public class DepositeUseCase {

	public static void main(String[] args) {
		AccountDao dao = new AccountDaoImpl();
		
//		Account acc1 = new Account();
//		acc1.setName("Amit");
//		acc1.setBalance(88099);
//		
//		boolean f= dao.createAccount(acc1);
//		if(f)
//			System.out.println("Account Created...");
//		else
//			System.out.println("Not Created....");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No:");
		int aaccno = sc.nextInt();
		Account acc = dao.findAccount(aaccno);
		if(acc==null)
			System.out.println("Account Does Not Exits....");
		else
		{
			System.out.println("Enter Deposite Amount:");
			int depo = sc.nextInt();
			acc.setBalance(acc.getBalance()+depo);
			boolean f = dao.updateAccount(acc);
			if(f)
				System.out.println("Account updated....");
			else
				System.out.println("Technical Error....");
		}
		
		
	}
}
