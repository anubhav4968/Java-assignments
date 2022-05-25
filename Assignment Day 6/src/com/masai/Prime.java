package com.masai;

public class Prime {
	
	public boolean checkPrime(int x) {
		int count=0;
//		System.out.println(x);
		for(int i=1;i<=x;i++) {
//			System.out.println(count);
//			if(count>=3) {
//				break;
//			}
			if(x%i==0) 
			{
				count++;	
			}
		}
		if(count>=3) 
		{
			return false;	
		}
		return true;
		
	}

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		int count=0;
		
		int[] primeArray=new int[inputArray.length];
		for(int i=0;i<inputArray.length;i++) {
			
			
			if(checkPrime(inputArray[i])==true) {
				primeArray[i]=inputArray[i];
			}
			else
			{
				count++;
				if(count==inputArray.length) {
					return primeArray=null;
				}
				
			}
			
		}
		
		return primeArray;
	}
	
	public static void main(String[] args) {
		Prime p = new Prime();
		int[] arr= {6,50,30,8,6};
		int[] ans=p.findAndReturnPrimeNumbers(arr);
		if(ans==null ) 
		{
			System.out.println("Prime number not found in the supplied Array");
		}
		else {
			String primeArray="";
			for(int i=0;i<ans.length;i++) {
				if(ans[i]==0) {
					continue;
				}
				
				primeArray=primeArray+ans[i]+" ";
			}
			System.out.println(primeArray);
		}
	}
	
}
