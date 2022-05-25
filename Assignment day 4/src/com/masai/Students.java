package com.masai;

public class Students {
  void StudentDetail(int roll,int age,int marks,String name) {
	  if(age<18 || age>60 || marks<0 || marks>500)
	  {
		 System.out.println("Enter valid Credentials"); 
	  }
	  else
	  {
	  System.out.println("The Roll is:" + roll +"\n"+"The age is:" + age +"\n"+"The Mas are:" +  marks +"\n"+ "The name is:"+ name);
	  }
  }
}
