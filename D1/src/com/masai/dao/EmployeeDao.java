package com.masai.dao;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeDao {

	public String saveEmployeeDetails(Employee employee);
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	public String deleteEmployee(int empId)throws EmployeeException;
}
