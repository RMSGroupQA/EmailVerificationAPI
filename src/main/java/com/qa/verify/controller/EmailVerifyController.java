package com.qa.verify.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.verify.Constants;
import com.qa.verify.object.Employee;
import com.qa.verify.service.EndWithVerifyService;

@RestController
public class EmailVerifyController {

	private EndWithVerifyService service;
	private RestTemplate restTemplate;

	public EmailVerifyController(EndWithVerifyService service, RestTemplateBuilder builder) {
		this.service = service;
		this.restTemplate = builder.build();
	}

	@CrossOrigin
	@PostMapping("/createEmployee")
	public String verify(@RequestBody Employee employee) {
		if (service.endWithVerify(employee) != null) {
			return restTemplate.postForEntity(Constants.CREATEEMPLOYEE, employee, String.class).getBody();
		}
		return "Invalid email.";
	}

}
