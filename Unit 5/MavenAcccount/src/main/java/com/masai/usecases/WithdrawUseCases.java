package com.masai.usecases;

import java.util.Scanner;

import com.masai.Dao.AccountDao;
import com.masai.Dao.AccountDaoImpl;
import com.masai.entity.Account;

public class WithdrawUseCases {

	public static void main(String[] args) {
		

		AccountDao dao = new AccountDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account no.");
		int acno = sc.nextInt();
		Account acc= dao.findAccount(acno);
		if(acc==null)
			System.out.println("Account Does Not Exits...");
		else
		{
			System.out.println("Enter Withdraw Amount:");
			int amou = sc.nextInt();
			if(amou<=acc.getBalance())
			{
				acc.setBalance(acc.getBalance()-amou);
				Boolean f= dao.updateAccount(acc);
				if(f)
					System.out.println("Collect the amount...");
				else
				System.out.println("Techinal error...");
			}
			else
			{
				System.out.println("Balance InSufficient.....");
			}
		}
		
	}

}
