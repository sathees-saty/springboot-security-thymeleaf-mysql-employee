package com.demo.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.springboot.dto.UserRegistrationDto;
import com.demo.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
