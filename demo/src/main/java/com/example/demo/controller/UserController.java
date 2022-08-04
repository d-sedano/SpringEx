package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService UserService;

    @GetMapping("/test")
    public String getUsers() {
    	
    	return "End-point gotten";

    }
}
