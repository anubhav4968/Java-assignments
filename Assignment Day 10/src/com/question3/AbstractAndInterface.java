package com.question3;

public class AbstractAndInterface {

	
	public static void main(String[] args) {
		//for abstract class we have to create their child for implementations.
		//for inheritance we use "extends".
		//If we create an abstract class we can't create their object directly.
		ChildOfAbstract child = new ChildOfAbstract();
		child.print();
		
		//by the inteface we achieve 100% abstraction in java.
		//for inheritance we use "implements".
		//an interface contains only abstract methods and constant variables .
		ChildOfInterface intr = new ChildOfInterface();
		intr.example();
	}
}
