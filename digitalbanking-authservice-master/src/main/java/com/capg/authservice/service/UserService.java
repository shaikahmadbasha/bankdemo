package com.capg.authservice.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	public Boolean authorizeUser(String userId, String password);
}