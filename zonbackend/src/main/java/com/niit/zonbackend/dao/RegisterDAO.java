package com.niit.zonbackend.dao;

import java.util.List;

import com.niit.zonbackend.model.Register;

public interface RegisterDAO {

	public void save (Register register);
	public void delete (String email);
	public void update (Register register);
	public Register getRegister(String email); //it is used to get all the fields in a category using primary key
	
	public List getAllRegister();
}
