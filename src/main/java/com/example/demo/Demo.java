package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class Demo {
	
	@GetMapping("/request")
	private String getResponse() {
		return "OK3";
	}

}
