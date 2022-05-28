package com.masai;

public class ThisAndSuper {

	String MyName = "Anubhav";
	public static void main(String[] args) {
	  ThisIn fun = new ThisIn();
	  fun.fun1();
	}
	
}
class ThisIn extends ThisAndSuper{

	
	String MyName = "Anubhav Mishra";
	void fun1() {
		System.out.println(this.MyName);
		
		System.out.println(super.MyName);
	}
}
