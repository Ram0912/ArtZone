package com.niit.zonbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Register")
@Component
public class Register {
	@Column
	private String username;
	
	@Column
	private double phoneNumber;
	@Id
	private String email;
	@Column
	private String password;

	public Register() {

	}

	public Register(String username,  double phoneNumber, String email, String password) {
		
		this.username = username;
		
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}



	public String getUserName() {
		return username;
	}

	public void setLastName(String username) {
		this.username = username;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
