package com.masai;

public class prime {
	 public static void main(String[] args) {
		
		 int n = 100;
		 
		 String  bag = "";
		 
		 if(n<100 & n>2)
		 {
		 
			 for(int i=1;i<=n;i++)
			 {
				 if(n%i==0)
				 {
					 bag=bag+i+" ";
				 }
			 }
			 System.out.println(bag);
		 }
		 else
		 {
			 System.out.println("Invalid number");
		 }
	}
}
