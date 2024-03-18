package com.methods.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.methods.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
      public Employee findByEmail(String email);
      //public Employee findBySalary(int salary);
      public Employee findByNameAndSalary(String name,int salary);
      public Employee findByEmailOrSalary(String email,int salary);
      
      
      @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
      Employee findBySalary(int salary);
}
