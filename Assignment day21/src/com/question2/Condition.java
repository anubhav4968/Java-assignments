package com.question2;

public class Condition {

	//it is condition where two or more threds are compete together to get certain 
	//shared resoures.
	public synchronized void fun1(String name)
	{
		
		System.out.println("Swagat h apka!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("My name is "+name+" and i m in condition class");
	}
}
