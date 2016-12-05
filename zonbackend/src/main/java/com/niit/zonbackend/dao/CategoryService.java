package com.niit.zonbackend.dao;

import java.util.List;

import com.niit.zonbackend.model.Category;

public interface CategoryService {

	public void save (Category category);
	
	public void update (Category category);
	
	public void delete (Category category);
	
	public Category get(String id);
	
	public List<Category> list();
}
