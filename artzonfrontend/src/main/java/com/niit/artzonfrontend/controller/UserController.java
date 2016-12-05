package com.niit.artzonfrontend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.zonbackend.dao.CategoryService;
import com.niit.zonbackend.model.Category;

 


public class UserController {

	@Autowired
	private CategoryService categoryService;
	 @RequestMapping("/cat")
	public String setupForm(Map<String, Object> map){
		Category category = new Category();
		map.put("category", category);
		return "category";
	}
	@RequestMapping(value="/cat.do", method=RequestMethod.POST)
	 public String doAction(@ModelAttribute Category category, BindingResult result, @RequestParam String action,Map<String, Object> map ){
		 
		Category categoryResult = new Category();
		switch (action.toLowerCase()){
		case "save":
			categoryService.save(category);
			categoryResult = category;
			break;
		case "update":
			categoryService.update(category);
			categoryResult = category;
			break;
			case "delete":
				categoryService.delete(category);
				categoryResult = category;
				break;
			case"search":
			Category searchedCategory =	categoryService.get(category.getId());
				categoryResult = searchedCategory!=null ? searchedCategory : new Category();
				break;
		}
		
		map.put("category", categoryResult);
		
		return "category";
		 
	 }
	
	
}
