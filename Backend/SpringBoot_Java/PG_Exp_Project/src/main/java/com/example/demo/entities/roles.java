package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class roles {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int roleId;

	    @Column(name = "role_name")
	    private String roleName;

		public roles() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getRoleId() {
			return roleId;
		}

		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
	    	
	}


