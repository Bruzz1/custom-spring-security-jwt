package com.brux.springsecurityjwtexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String welcomePage() {
		return "Welcome to my custom spring security updated";
	}
	
}
