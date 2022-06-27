package com.question3;

public class Transit {

	//this keyword used at the time of serilization when we don't want to save our
	//any variable for any security reason then that type of variable we decalre as 
	//transient
	String name;
	transient int pass;
	public Transit(String name, int pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Transit [name=" + name + "]";
	}
	public static void main(String[] args) {
		Transit tr = new Transit("Anubhav", 1234);
		System.out.println(tr.toString());//on printing you can't see the password
		                                  //because of transient
		
		
		
		
	}
	
}