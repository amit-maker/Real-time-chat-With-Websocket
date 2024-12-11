package com.ass.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.ass.dto.UserRegistrationDto;
import com.ass.model.User;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
