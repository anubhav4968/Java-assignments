package com.question2;

public class ThreadA extends Thread{
	Condition c;
	String name;
	
	public ThreadA(Condition c, String name) {
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run()
	{
		c.fun1(name);
	}

}
