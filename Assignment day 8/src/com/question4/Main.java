package com.question4;

public class Main {

	
		public static void main(String[] args){
		//create an array of Animal class with size 3
		//initialize all 3 elements of this Animal class
		//with //Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.                                                
			Animal[] ani = new Animal[3];
			Dog dog = new Dog();
			ani[0]=dog;
			Cat cat = new Cat();
			ani[1] = cat;
			Tiger tiger = new Tiger();
			ani[2] = tiger;
			for(int i=0;i<ani.length;i++) {
				ani[i].makeNoise();
				ani[i].eat();
				ani[i].walk();
			}
 		}
		
}
