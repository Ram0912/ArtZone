package com.niit.zonbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.zonbackend.dao.RegisterDAO;
import com.niit.zonbackend.model.Register;

@Repository("registerDAO")
public class RegisterDAOImpl implements RegisterDAO {
@Autowired

private SessionFactory sessionFactory;
	
	public void save(Register register) {
		sessionFactory.getCurrentSession().save(register);
		
	}
	
	public void delete(String email) {
		sessionFactory.getCurrentSession().delete(getRegister(email));
		
	}

	public void update(Register register) {
		sessionFactory.getCurrentSession().update(register);
		
	}

	public Register getRegister(String email) {
		return (Register)sessionFactory.getCurrentSession().get(Register.class, email);
	}

	public List getAllRegister() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Register").list();
	}

}
