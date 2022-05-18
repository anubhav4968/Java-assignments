package com.masai;

public class StaticAndNonstatic {
    //NonStatic variable - These variable are the part of Hard Disk , so they can't be access in
   //the RAM. If we want to access it we have to create an object with the use of new key word into
  //the main region. 
	int i = 10;
	
	//Static variable - These variable are the part of RAM , so they are easy to access in the main
   //We access static variable by the three ways . 
	static void name () {
		
		System.out.println("My Name is Anubhav Mishra");
		
	}
	
	public static void main(String[] args) {
		
		StaticAndNonstatic value = new StaticAndNonstatic();
		
		System.out.println(value.i );
		//first way- By direct calling them. 
		//name();
		
		//Second way - By creating the object
		//value.name();
		
		//Third way - By using classname.(dot). 
		StaticAndNonstatic.name();	
	}
}
