package com.masai;

import java.util.Scanner;

public class cicketScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1s");
		int scoreOf1 = sc.nextInt();
		
		System.out.println("Enter 2s");		
		int scoreOf2 = sc.nextInt();
		
		System.out.println("Enter 3s");		
		int scoreOf3 = sc.nextInt();
		
		System.out.println("Enter 4s");		
		int scoreOf4 = sc.nextInt();
		
		System.out.println("Enter 6s");
		int scoreOf6 = sc.nextInt();
		
		int totalScore = scoreOf1 + scoreOf2*2 + scoreOf3*3 + scoreOf4*4 + scoreOf6*6 ;
		System.out.println(totalScore);
		
		
	}

}
