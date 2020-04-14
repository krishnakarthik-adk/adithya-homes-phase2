package com.adithyahomesp2.expensetracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adithyahomesp2.expensetracker.models.User;
import com.adithyahomesp2.expensetracker.repositories.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userRepository.getOne(id);
	}
}
