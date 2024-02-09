package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.OwnerService;

@RestController
public class OwnerController {

	@Autowired
	OwnerService owner_service;
}
