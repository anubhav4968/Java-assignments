package com.question1;

public class Main {

	public static void main(String[] args) {
		Bird b1 = new Parrot();
		b1.fly();
		
		//and after downcasting this b1 reference to the
        //Parrot class object, call the sing method also
		Parrot m1 = (Parrot)b1;
		m1.sing();
	}
}
class Bird{
	public void fly() {
		System.out.println("Birds is flying");
	}
}
class Parrot extends Bird{
	@Override
	public void fly(){
		System.out.println("I m flying");
	}
	
	public void sing() {
		System.out.println("I m singing");
	}
}
