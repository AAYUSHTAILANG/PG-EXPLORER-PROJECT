package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.services.CityService;

@RestController
public class CityController {
	@Autowired
	CityService city_service;
	
	@GetMapping("/all")
	public List<City> getAll()
	{
		return city_service.getAll();
	}
	
	@PostMapping("/savecity")
	public City saveCity(@RequestBody City cust)
	{
		return city_service.saveCust(cust);
	}
	
	
}
