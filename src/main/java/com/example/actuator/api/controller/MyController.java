package com.example.actuator.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-boot-actuator")
public class MyController {
	@GetMapping("/test")
	public String testEndPoint()
	{
		System.out.println("MyController.testEndPoint()");
		return "This is the Actuator Project demo";
	}
}