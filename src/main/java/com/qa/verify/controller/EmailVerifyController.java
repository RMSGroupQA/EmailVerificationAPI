package com.qa.verify.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
			//send email that address is good
			return restTemplate.postForEntity("http://localhost:8082/createEmployee", employee, String.class).getBody();
		}
		//send email that address is bad
		return "Invalid email.";
	}

}
