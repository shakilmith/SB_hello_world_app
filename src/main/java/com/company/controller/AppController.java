package com.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
 
	
	@GetMapping("/hello") //this is the mapping url path
	public String hello() { 
		return "Helllo Spring Boot"; 
	}
}
