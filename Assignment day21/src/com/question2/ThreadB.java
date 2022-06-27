package com.question2;

public class ThreadB extends Thread{

	Condition c;
	String name;
	
	public ThreadB(Condition c, String name) {
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}
}
