package com.JunitTest.EmployeeJunitTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.JunitTest.Entity.Employee;
import com.JunitTest.Repository.EmployeeRepository;

@DataJpaTest
public class JunitTest 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	Employee employee;
	
	@BeforeEach
	public void Employee() 
	{
		employee=new Employee();
		employee.setEmployeeId("28");
		employee.setName("Mooventhira kumar.M");
	}
	
	@Test
	public void saveEmployee()
	{
		Employee savedEmployee=employeeRepository.save(employee);
		    Assertions.assertThat(savedEmployee).isNotNull();
	}
	
	
	@Test
	@DisplayName("Check the id greater than zero ")
	public void CheckIdGreaterThan() 
	{
		Employee savedEmployee=employeeRepository.save(employee);
		Assertions.assertThat(savedEmployee.getId()).isGreaterThan(0);
	}
	
	
	

}
