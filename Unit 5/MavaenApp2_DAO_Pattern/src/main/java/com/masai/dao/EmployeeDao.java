package com.masai.dao;

public interface EmployeeDao {

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String getNameAndAddress(int empId);
}
