package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.rolesRepository;

@Service
public class rolesService {
	@Autowired
	rolesRepository roles_repo;
	
}
