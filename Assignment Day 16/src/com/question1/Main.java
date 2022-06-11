package com.question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Product> products = new ArrayList <>();
		
		Scanner scan = new Scanner(System.in);
		 int count = 1;
		 
		 while(true)
		 {
			 System.out.println("Enter Product Details "+count++ );
			 
			 System.out.println("Enter ProductId:");
			 int pid = scan.nextInt();
			 
			 System.out.println("Enter productName:");
			 String pName = scan.next();
			 
			 System.out.println("Enter ProductPrice:");
			 double price  = scan.nextDouble();
			 
			 Product product = new Product(pid,pName,price);
			 
			 System.out.println("Want More To Add y/n");
			 String ans = scan.next();
			 if(ans.equalsIgnoreCase("n"))
			 {
				 break;
			 }
			 
		 }
		 System.out.println("Enter your choice for sorting:");
		 System.out.println("1 for sorting the product according to the productPrice");
		 System.out.println("2 for sorting the product according to the productName");
		 System.out.println("3 for sorting the product according to the productId");
		 String choice = scan.next();
		 if(choice.equals("1"))
		 {
			 
		 }
	}
}
