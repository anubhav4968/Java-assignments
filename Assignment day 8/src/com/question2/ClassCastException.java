package com.question2;

public class ClassCastException {
  //when we call another class without downcasting then it shows ClassCastException.
	public static void main(String[] args) {
		
		Name name = new Name();
		name.prnt();
		//name.print();//ClassCastException
        Sername sername=(Sername)name;//Downcast the child class object to the parent class object .
        sername.print();
	}
	
}
class Name{

	public void prnt() {
		System.out.println("My name is anubhav!!!!!!!!!");
	}
}
class Sername extends Name{
	public void print() {
		System.out.println("My sername is Mishra!!!!");
	}
}