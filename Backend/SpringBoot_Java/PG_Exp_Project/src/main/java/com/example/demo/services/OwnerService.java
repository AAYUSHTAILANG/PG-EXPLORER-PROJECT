package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.OwnerRepository;

@Service
public class OwnerService {
	@Autowired
	OwnerRepository owner_repo;
}
