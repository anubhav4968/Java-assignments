package com.question2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Address ad = new Address("Up","kanpur","208001");
		
		Student s1 = new Student(12,"Anubhav",ad,"Omanubhavmishra@gmial.com","12345");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xyz.txt"));
		
		oos.writeObject(s1);
		oos.close();
		System.out.println("Done....");
	}
}
