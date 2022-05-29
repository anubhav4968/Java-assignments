package com.masai;
import java.util.Scanner;
public class Demo {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Bank Name:");
		String bank =scan.next();
		
		
		System.out.println("Enter Branch Name:");
		String branch  = scan.next();
		
		System.out.println("Enter IFCS Code:");
		String ifcs = scan.next();
		scan.close();
		
//		getBank(bank);
		if(getBank(bank)==null)
	    {
	    	System.out.println("Error null");
	    }
		else
		{
		
		Object x=getBank(bank);
//		System.out.println(x);
		 if(x.toString().equals("com.masai.AxisBank@39ba5a14")){
	 
//		System.out.println("Anubhav");
		    AxisBank ax = new AxisBank(branch,ifcs,12.8);
	
		ax.displayDetails();
		ax.getCreditCard();
	     }
	    else if(x.toString().equals("com.masai.ICICIBank@39ba5a14")) {

		ICICIBank ic = new ICICIBank(branch,ifcs,156);
		ic.displayDetails();
	  }
		}
		
}
	public static Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("axis")) {
			AxisBank axis = new AxisBank();
			return axis;
		}
		else if(bank.equalsIgnoreCase("icici")) {
			ICICIBank icici = new ICICIBank();
			return icici;
		}
		else {
		return null;
		}
	}
	
}

class ICICIBank extends Bank{
	double rateOfIntrest;
	ICICIBank(){
		
	}
	ICICIBank(String branchName,String ifcsCode,double rateOfIntrest){
		super (branchName,ifcsCode);
		this.rateOfIntrest = rateOfIntrest;
	}
	@Override
	public void displayDetails() {
		System.out.println("Branch Name:"+branchName);
		System.out.println("IFCS Code:"+ifcsCode);
		System.out.println("Rate Of Interest:"+rateOfIntrest);
	}
	
}
class AxisBank extends Bank{
	double rateOfIntrest;
	AxisBank(){
		
	}
	AxisBank(String branchName,String ifcsCode,double rateOfIntrest){
		super (branchName,ifcsCode);
		this.rateOfIntrest = rateOfIntrest;
	}
	@Override
	public void displayDetails() {
		System.out.println("Branch Name:"+branchName);
		System.out.println("IFCS Code:"+ifcsCode);
		System.out.println("Rate Of Interest:"+rateOfIntrest);
	}
	
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
class Bank {

	String branchName;
	String ifcsCode;

	Bank(){
		
	}
	Bank(String branchName,String ifcsCode){
		this.branchName = branchName;
		this.ifcsCode = ifcsCode;
	}
	
	public void displayDetails() {
		System.out.println("Branch Name:"+branchName);
		System.out.println("IFCS Code:"+ifcsCode);
	}
	
}






