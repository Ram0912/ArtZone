package com.niit.artzonbackend;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.artzonbackend.dao.CategoryDAO;
import com.niit.artzonbackend.model.Category;





public class CategoryTestCase{

	@Autowired
	static
	AnnotationConfigApplicationContext context;
	@Autowired
	static
	Category category;
	@Autowired
	static
	CategoryDAO categoryDAO;
@BeforeClass

public static void init()
{
	context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.artzonbackend");
	context.refresh();
	
	CategoryDAO categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
	Category category = (Category) context.getBean("category");
	System.out.println("The object is created");
}

//start writing Junit test case
//for each method defined in DAO
//@Test to make it as test case
@Test
public void createCategoryTestcase()
{
	category.setId("C002");
	category.setDescription("This is category 2");
	category.setName("book category");
	
	Boolean status= categoryDAO.save(category);
	
	Assert.assertEquals("create category test case", true, status);
	
}

}