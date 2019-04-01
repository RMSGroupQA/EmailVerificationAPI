package com.qa.verify.service;

import org.springframework.stereotype.Service;

import com.qa.verify.object.Employee;

@Service
public class EndWithVerifyService {
	
	public Employee endWithVerify(Employee employee) {
		if(employee.getEmail().endsWith("@qa.com")) {
			employee.setRole("Trainer");
			employee.setEmail(employee.getEmail().substring(0, employee.getEmail().length()-4));
			return employee;
		}else if(employee.getEmail().endsWith("@academytrainee.com")) {
			employee.setRole("Trainee");
			employee.setEmail(employee.getEmail().substring(0, employee.getEmail().length()-4));
			return employee;
		}else {
			return null;
		}
	}
	
}
