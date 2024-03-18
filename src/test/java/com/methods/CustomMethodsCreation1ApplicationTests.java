package com.methods;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.methods.Entity.Employee;
import com.methods.Repository.EmployeeRepository;

@SpringBootTest
class CustomMethodsCreation1ApplicationTests {
   @Autowired
   private EmployeeRepository repo;
   //run project through the juni
	@Test
	void saveEmployeeDetails()
	{
		Employee e=new Employee();
		 e.setEmail("chqaqandu@123");
		 e.setName("chanadu");
		 e.setSalary(1500);
           repo.save(e);
	}
	@Test
	public void deleteId()
	{
		repo.deleteById(3);
	}
	@Test
	 void getRecordById()
	{
		  Optional<Employee> byId = repo.findById(1);
		  
		               Employee emp = byId.get();
		               System.out.println(emp.getEmail());
		               System.out.println(emp.getName());
		               System.out.println(emp.getSalary());

		               
	}
	@Test
	public void getAllRecord()
	{
		   Iterable<Employee> all = repo.findAll();
		    for(Employee empl:all)
		    {
		    	System.out.println(empl.getEmail());
		    	System.out.println(empl.getName());
		    	System.out.println(empl.getSalary());
		    }
		
	}
// Create Custom Methods as following
	@Test
	public void findRecordByEmail()
	{
		     Employee email = repo.findByEmail("somu@123");
		     System.out.println(email.getEmail());
		     System.out.println(email.getName());
		     System.out.println(email.getSalary());
		     
	}
	@Test
	public void findRecordBySalary()
	{
		  Employee bySalary = repo.findBySalary(4566);
		  System.out.println(bySalary.getEmail());
		     System.out.println(bySalary.getName());
		     System.out.println(bySalary.getSalary());
	}
	@Test
	public void findByEmaiSalary()
	{
		Employee s = repo.findByNameAndSalary("somu", 4566);
		
		System.out.println(s.getEmail());
		System.out.println(s.getName());
		System.out.println(s.getSalary());
	}
	@Test
	public void EmailOrSalary()
	{
		 Employee o = repo.findByEmailOrSalary("somu@123", 1500);
		
		System.out.println(o.getEmail());
		System.out.println(o.getName());
		System.out.println(o.getSalary());
	}
}
