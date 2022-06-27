package com.question3;

public class Main {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		synchronized (mt) {
			System.out.println("I m in main method");
			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("End Of main method");
			System.out.println(mt.tot);
		}
	}
}
