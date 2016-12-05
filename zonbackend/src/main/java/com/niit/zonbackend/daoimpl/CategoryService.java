package com.niit.zonbackend.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.zonbackend.dao.CategoryDAO;
import com.niit.zonbackend.model.Category;
@Service
public class CategoryService implements com.niit.zonbackend.dao.CategoryService {
@Autowired
private CategoryDAO categoryDAO;

@Transactional
	public void save(Category category) {
		categoryDAO.save(category);
		

	}
@Transactional
	public void update(Category category) {
		categoryDAO.update(category);
		

	}
@Transactional
	public void delete(Category category) {
		categoryDAO.delete(category);

	}
@Transactional
	public Category get(String id) {
		// TODO Auto-generated method stub
		return categoryDAO.get(id);
	}
@Transactional
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
