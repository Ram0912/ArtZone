package com.niit.artzonbackend.dao;

import java.util.List;

import com.niit.artzonbackend.model.Category;

public interface CategoryDAO {

	//CRUD operations
	public boolean save(Category category);
	public boolean update(Category category);
	public boolean delete(Category category);
	public Category get(String id);
	public List<Category> list();
}
