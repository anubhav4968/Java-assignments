package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.UTill.EMU_utill;
import com.masai.entity.Employee;


public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String getAddressOfEmployee(int empId) {
		
		String message = "Employee Does Not Exists...";	
		
		EntityManager em= EMU_utill.provideEntityManager();
		Employee emp = em.find(Employee.class, empId);
		if(emp !=null)
		{
			message=emp.getAddress();
		}
		em.close();
		return message;
	}
	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String message = "Not Done..";
		EntityManager em =EMU_utill.provideEntityManager();
		
		
		Employee emp = em.find(Employee.class, empId);
		if(emp!=null)
		{
			em.getTransaction().begin();
		    emp.setSalary(emp.getSalary()+bonus);
		    em.getTransaction().commit();
		    message = "Bonus Given..";
		}
		em.close();
		System.out.println("Done.....");
		
		return message;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean ans = false;
		
		EntityManager em =EMU_utill.provideEntityManager();

		Employee emp = em.find(Employee.class, empId);
		if(emp !=null)
		{
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			ans=true;
		}
		else {
			System.out.println("Employee does not exits.....");
		}
		em.close();
		System.out.println("Done.....");
		
		return ans;
	}

	@Override
	public String getNameAndAddress(int empId) {
		String message = "Not Done..";
		EntityManager em =EMU_utill.provideEntityManager();
		Employee emp = em.find(Employee.class, empId);
		if(emp !=null)
		{
			message = "Name is: "+emp.getName() + "Address is: "+emp.getAddress();
			
		}
		return message;
	}

}
