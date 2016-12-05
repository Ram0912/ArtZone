package com.niit.zonbackend.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.zonbackend.dao.RegisterDAO;
import com.niit.zonbackend.dao.RegisterServiceDAO;
import com.niit.zonbackend.model.Register;

@Service
public class RegisterServiceDAOImpl implements RegisterServiceDAO{
	@Autowired
	private RegisterDAO registerDAO;
	
	@Transactional
	public void save(Register register) {
		registerDAO.save(register);

	}
	@Transactional
	public void delete(String email) {
		registerDAO.delete(email);

	}
	@Transactional
	public void update(Register register) {
		registerDAO.update(register);

	}
	@Transactional
	public Register getRegister(String email) {
		// TODO Auto-generated method stub
		return registerDAO.getRegister(email);
	}
	@Transactional
	public List getAllRegister() {
		// TODO Auto-generated method stub
		return registerDAO.getAllRegister();
	}

}
