package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.userRepository;

@Service
public class userService {

	private userRepository UserRepository;

	@Autowired
	userService(userRepository UserRepository) {
		this.UserRepository = UserRepository;
	}
	
	
}
