package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.OccupantRepository;

@Service
public class OccupantService {
	@Autowired
	OccupantRepository occupant_repo;
}
