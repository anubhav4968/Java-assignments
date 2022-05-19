package com.masai;

public class nonStaticMethod {
  
	void number(int n) {
		
		if (n>=0)
		{
			if(n%2!=0)
			{
				System.out.println(n);
			}
			else
			{
				System.out.println(n*10);
			}
		}
		else
		{
			System.out.println("Error");
		}
			
	}
	public static void main(String[] args) {
		
		new nonStaticMethod().number(10);
	}
}
