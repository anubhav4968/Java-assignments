package com.masai;

public class ServiceBean {
	private int num1;
	private int num2;
	

	public void setNum1(int num1) {
		this.num1 = (int)num1;
	}
	public void setNum2(int num2) {
		this.num2 = (int)num2;
	}
	public void sum()
	{
		System.out.println("sum of numbers:- "+(num1+num2));
	}
	public void multiplication()
	{
		System.out.println("multi of the numbers:- "+num1*num2);
	}
	public void subtraction()
	{
		System.out.println("substraction of numbers:- "+(num1-num2));
	}
	
}
