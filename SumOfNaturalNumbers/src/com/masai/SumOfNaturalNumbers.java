package com.masai;
//for input taking from the user
import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
	//for input taking from the user
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Number");
		int number = sc.nextInt();
		
		int totalSum = number * (number + 1) / 2;
		
		System.out.println(totalSum);
	}

}
