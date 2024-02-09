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
@Table(name="occupant")
public class Occupant {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int occupant_id;
	@Column
	private String owner_fname;
	@Column
	private String owner_lname;
	
	@Column
	private String owner_email;
	@Column
	private String contact;
	@Column
	private String owner_adhar;
	@Column
	private String owner_address;
	@OneToOne
	@JoinColumn(name="user_id")
	private Users user_id;
	@OneToOne
	@JoinColumn(name="area_id")
	private Area owner_area_id;
	
	public Occupant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOccupant_id() {
		return occupant_id;
	}

	public void setOccupant_id(int occupant_id) {
		this.occupant_id = occupant_id;
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

	public String getOwner_adhar() {
		return owner_adhar;
	}

	public void setOwner_adhar(String owner_adhar) {
		this.owner_adhar = owner_adhar;
	}

	public String getOwner_address() {
		return owner_address;
	}

	public void setOwner_address(String owner_address) {
		this.owner_address = owner_address;
	}

	public Users getUser_id() {
		return user_id;
	}

	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}

	public Area getOwner_areaId() {
		return owner_area_id;
	}

	public void setOwner_areaId(Area owner_areaId) {
		this.owner_area_id = owner_areaId;
	}
	
	
}
