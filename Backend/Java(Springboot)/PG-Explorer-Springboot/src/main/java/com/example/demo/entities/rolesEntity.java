package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
public class rolesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	public int role_id;
	
	@Column
	public String role_name;

	public rolesEntity() {
		super();
		
	}
	
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	
	
	
	
	
}
