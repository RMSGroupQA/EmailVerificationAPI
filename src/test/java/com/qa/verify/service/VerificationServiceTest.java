package com.qa.verify.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.verify.object.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VerificationServiceTest {
	Employee testEmployee = new Employee();
	EndWithVerifyService verify = new EndWithVerifyService();
	
	@Test
	public void QATest() {
		testEmployee.setEmail("John@qa.com");
		verify.endWithVerify(testEmployee);
		assertEquals("Trainer",testEmployee.getRole());
		assertEquals("John@qa",testEmployee.getEmail());
	}
	
	@Test
	public void TraineeTest() {
		testEmployee.setEmail("John@academytrainee.com");
		verify.endWithVerify(testEmployee);
		assertEquals("Trainee",testEmployee.getRole());
		assertEquals("John@academytrainee",testEmployee.getEmail());
	}
	
	@Test
	public void NeitherTest() {
		testEmployee.setEmail("John@gmail.com");
		verify.endWithVerify(testEmployee);
		assertEquals(null,verify.endWithVerify(testEmployee));
	}
	

}
