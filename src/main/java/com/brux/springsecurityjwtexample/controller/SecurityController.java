package com.brux.springsecurityjwtexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brux.springsecurityjwtexample.model.User;
import com.brux.springsecurityjwtexample.repository.UserRepository;

@RestController
public class SecurityController {
	
	@Autowired
	UserRepository userRepo;

	
	@GetMapping("/Users")
	public ResponseEntity<?> getUsers() {
		List<User> users = new ArrayList<User>();
		users = userRepo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(users);	
	}
	
	@GetMapping("/Add")
	public ResponseEntity<?> addUser(){
		User user = new User();
		user.setUserName("Yohan");
		user.setPassword("password");
		user.setEmail("yohan@gmail.com");
		return ResponseEntity.status(HttpStatus.OK).body(userRepo.save(user));
		
	}
}
