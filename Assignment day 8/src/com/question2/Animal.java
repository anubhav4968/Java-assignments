package com.question2;

public class Animal {

	public void makeNoise(){
		System.out.println("Animal making Noise");
		}
    public void eat(){
		System.out.println("Animal is eating");
		}
	public void walk(){
		System.out.println("Animal is walking");
		System.out.println("==================");
		}
}
class Cat extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("            ");
		System.out.println("I m a Cat");
		System.out.println("Meaw...");
		}
}

class Dog extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("I m a Dog");
		System.out.println("Barking......");
		}
}

class Tiger extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("            ");
		System.out.println("I m a Tiger");
	System.out.println("Raoring...");
	}
}