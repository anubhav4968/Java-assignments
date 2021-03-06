package com.masai.dao;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeDao {

	public String insertEmployeeDetails(int eid,String name,String address,int salary);
	
	public int getSalaryByEid(int eid) throws EmployeeException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	
	public boolean giveBonusToEmployee(int bonus);
	
	public Employee getEmployeebyId(int eid) throws EmployeeException;
	
	public List<Employee> getAllEmployeeWithCondition() throws EmployeeException;
}
