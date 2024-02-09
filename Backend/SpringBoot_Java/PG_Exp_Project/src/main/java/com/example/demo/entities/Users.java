package com.example.demo.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	@Column
	private String user_email;
	@Column
	private String user_password;
	@Column
	private String user_active_status;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Roles user_role;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_active_status() {
		return user_active_status;
	}

	public void setUser_active_status(String user_active_status) {
		this.user_active_status = user_active_status;
	}

	public Roles getUser_role() {
		return user_role;
	}

	public void setUser_role(Roles user_role) {
		this.user_role = user_role;
	} 
	
	public Users() {
		super();
		
	}
	
}
