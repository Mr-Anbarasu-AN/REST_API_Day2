package com.example.springapp.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Value("${value}")
	public String name;
	@GetMapping("/")
	public String values() {
		return "Hi "+name;
	}
	
}
