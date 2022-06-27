package com.question2;

public class Main {

	public static void main(String[] args) {
		
		Condition c = new Condition();
		
		ThreadA ta = new ThreadA(c, "Anubhav");
		ThreadB tb = new ThreadB(c, "Brijesh");
		
		ta.start();
		tb.start();
	}
}
