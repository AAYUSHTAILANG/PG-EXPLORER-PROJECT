package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.AreaRepository;

@Service
public class AreaService {
	@Autowired
	AreaRepository area_repo;
	
}
