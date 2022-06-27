package com.question3;

public class MyThread extends Thread{
	int tot=0 ;

	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("i m in mythread class");
		for(int i=0;i<=20;i++)
		{
			tot=tot+i;
		}
		System.out.println("end of MyThread class");
			notify();
	
		}
	}

}
