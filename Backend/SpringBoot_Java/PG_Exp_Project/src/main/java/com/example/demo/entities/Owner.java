package com.example.demo.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="owner")
public class Owner {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int owner_id;
	
	@Column
	private String owner_fname;
	@Column
	private String owner_lname;
	@Column
	private String owner_email;
	@Column
	private String contact;
	@Column
	private String owner_aadhar;
	@OneToOne
	@JoinColumn(name="user_id")
	private Users user_id;
	@OneToOne
	@JoinColumn(name="area_id")
	private Area owner_area_id;
	public Owner() {
		
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getOwner_fname() {
		return owner_fname;
	}
	public void setOwner_fname(String owner_fname) {
		this.owner_fname = owner_fname;
	}
	public String getOwner_lname() {
		return owner_lname;
	}
	public void setOwner_lname(String owner_lname) {
		this.owner_lname = owner_lname;
	}
	public String getOwner_email() {
		return owner_email;
	}
	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getOwner_aadhar() {
		return owner_aadhar;
	}
	public void setOwner_aadhar(String owner_aadhar) {
		this.owner_aadhar = owner_aadhar;
	}
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	public Area getOwner_area_id() {
		return owner_area_id;
	}
	public void setOwner_area_id(Area owner_areaId) {
		this.owner_area_id = owner_areaId;
	}
	
	
	
	
}
