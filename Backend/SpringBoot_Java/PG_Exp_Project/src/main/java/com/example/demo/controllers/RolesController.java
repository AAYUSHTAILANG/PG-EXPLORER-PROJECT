package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.rolesService;

@RestController
public class RolesController {
	@Autowired
	rolesService roles_service;
	
}
