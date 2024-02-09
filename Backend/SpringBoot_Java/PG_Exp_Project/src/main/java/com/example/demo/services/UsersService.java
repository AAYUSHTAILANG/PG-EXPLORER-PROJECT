package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UsersReopository;

@Service
public class UsersService {
	
	@Autowired
	UsersReopository users_repository;
}
