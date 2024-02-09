package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.AreaService;

@RestController
public class AreaController {
	@Autowired
	AreaService area_service;
}
