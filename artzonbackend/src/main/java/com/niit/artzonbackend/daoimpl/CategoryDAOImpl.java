package com.niit.artzonbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.artzonbackend.dao.CategoryDAO;
import com.niit.artzonbackend.model.Category;

public class CategoryDAOImpl implements CategoryDAO{
@Autowired
SessionFactory sessionFactory;
	public boolean save(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public Category get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
