package com.niit.mainbackend.dao;

import java.util.List;

import com.niit.mainbackend.model.Category;

public interface CategoryDao {

	//CRUD operations
		public boolean create( Category category);
		public boolean update(Category category);
		public boolean delete(Category category);
		public Category get(String id);
		public List<Category> list();
		

}
