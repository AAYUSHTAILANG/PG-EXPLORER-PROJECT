package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.UsersService;

@RestController 
public class UsersController {

	UsersService users_service;
}
