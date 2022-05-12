package com.example.springbootapi;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/hospitals")
	public List<String> hospitals() {
		return List.of("AHN", "TMH", "QMH", "PWH", "HHH", "TKO");
	}

}
