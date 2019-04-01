package com.qa.verify.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.verify.object.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeEntityTest {

	Employee testEmployee = new Employee();

	@Test
	public void forenameTest() {
		testEmployee.setForename("a");
		assertEquals("a", testEmployee.getForename());
	}
	
	@Test
	public void lastnameTest() {
		testEmployee.setLastname("a");
		assertEquals("a", testEmployee.getLastname());
	}
	
	@Test
	public void passwordTest() {
		testEmployee.setPassword("a");
		assertEquals("a", testEmployee.getPassword());
	}
	
	@Test
	public void roleTest() {
		testEmployee.setRole("a");
		assertEquals("a", testEmployee.getRole());
	}

	@Test
	public void emailTest() {
		testEmployee.setEmail("a");
		assertEquals("a", testEmployee.getEmail());
	}
	
	@Test
	public void idTest() {
		assertEquals(0,testEmployee.getEmployeeID());
	}
	
	@Test
	public void stringTest() {
		assertEquals("Employee [employeeID=0, forename=null, lastname=null, role=null, email=null]",testEmployee.toString());
	}
}
