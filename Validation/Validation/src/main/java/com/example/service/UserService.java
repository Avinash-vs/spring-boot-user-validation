package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.Userrepository;

@Service
public class UserService {

	@Autowired
	Userrepository ur;
	
	public String saveUser(User u) {
		ur.save(u);
	return "user saved successfully";
	}
}
