package com.masai.entity;

//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.Column;
//import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "pid")
public class Employee extends Person{

//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name = "State" ,column =@Column(name = "Home_State")),
//		@AttributeOverride(name = "City" ,column =@Column(name = "Home_City")),
//		@AttributeOverride(name = "Pincode" ,column =@Column(name = "Home_pincode"))
//	})
	private Address homeAddress;
	
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name ="State",column=@Column(name = "Office_State")),
//		@AttributeOverride(name ="City",column =@Column(name ="Office_City")),
//		@AttributeOverride(name="Pincode",column=@Column(name="Pffice_Pincode"))
//	})
	private Address officeAddress; 
	private int salary;
	
	
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + ", salary=" + salary + "]";
	}
	
	
}
