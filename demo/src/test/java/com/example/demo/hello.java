package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/demo")
public class hello {
	
	@GetMapping
	public String getName() {
		return "Hello ";
	}
}