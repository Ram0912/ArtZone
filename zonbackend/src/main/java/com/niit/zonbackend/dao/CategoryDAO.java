package com.niit.zonbackend.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.niit.zonbackend.model.Category;

@Component()
public interface CategoryDAO 
	
	 {

		public boolean save (Category category);
		
		public boolean update (Category category);
		
		public boolean delete (Category category);
		
		public Category get(String id);
		
		public List<Category> list();

		public boolean saveOrUpdate(Category category);
	}


