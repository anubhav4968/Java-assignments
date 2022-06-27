package com.question1;

public class Calculate extends Thread{
	
	int product=1;
	
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++)
			{
				product = product*i;
			}
			System.out.println("Product is:"+product);
		}
	}
}
