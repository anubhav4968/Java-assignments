import javax.persistence.EntityManager;

import com.masai.entity.Department;
import com.masai.entity.Employee;
import com.masi.utill.EMUtil;

public class Main {

	public Main() {
		EntityManager em = EMUtil.provideEntityManager();
		
		Department dept = new Department();
		dept.setdName("Hr");
		dept.setLocation("Lucknow");
		
		Employee emp1 = new Employee();
		emp1.setAddress("Kanpur");
		emp1.seteName("Anubhav");
		emp1.setSalary(10000);
		emp1.setDept(dept);
		
		Employee emp2 = new Employee();
		emp2.setAddress("Varanasi");
		emp2.seteName("Brijesh");
		emp2.setSalary(1000);
		emp2.setDept(dept);
		
		Employee emp3 = new Employee();
		emp3.setAddress("Mumbai");
		emp3.setDept(dept);
		emp3.seteName("Ramesh");
		emp3.setSalary(32110);
		
		
		dept.getEmp().add(emp1);
		dept.getEmp().add(emp3);
		dept.getEmp().add(emp2);
		
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		
		System.out.println("Added.....");
	}
}
