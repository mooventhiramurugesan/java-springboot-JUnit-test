package com.JunitTest.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.JunitTest.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	
	
	

}
