package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.User;
import com.example.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	UserService us;
	
	@PostMapping("/save")
	public String save(@Valid @RequestBody User u) {
		return us.saveUser(u);
	}

}
