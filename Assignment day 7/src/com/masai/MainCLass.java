package com.masai;

public class MainCLass {

	public static void main(String[] args) {
		Student s1 = new Student(123,"Anubhav",11209.0);
		DayScholar ds = new DayScholar(2345);
		ds.transportFee();
		System.out.println("Total Remaining Amount: "+ds.payFee(13553));
		
		Hosteler hs = new Hosteler(4579);
		hs.hostelFee();
		System.out.println("Total Remaing Amount:"+hs.payFee(123456));
	}
}
class Student{
	int studId ;
	String studName ;
	double examFee;

	
	Student(){
		
	}
	
   Student(int studId,String studName,double examFee){
		this.studId = studId;
		this.studName = studName;
		this.examFee  = examFee;
		
	}
	
	public void displayDetails() {
		System.out.println("Student ID: " + studId);
		System.out.println("Student Name:"+studName);
	}
	public double payFee(double fee) {
	
		return (examFee-fee);
	}
}
class DayScholar extends Student{
	
	double transportFee;
//	@Override
	DayScholar(double transportFee){
		this.transportFee=transportFee;
	}
	public void transportFee(){
		transportFee= examFee+transportFee;
	}
	@Override
	public double payFee(double fee) {
		
		return (fee-transportFee);
	}

}
class Hosteler extends Student{
	double hostelFee;

	Hosteler(double hostelFee){
		this.hostelFee=hostelFee;
	}
	public void hostelFee() {
		hostelFee=examFee+hostelFee;
	}
	@Override
	public double payFee(double fee) {
		return (fee-hostelFee);
    }
}



