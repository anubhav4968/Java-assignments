package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int acno;
	private String name;
	private int balance;
	
	
	
	public Account(int acno, String name, int balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account() {
		
	}
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
