package com.niit.mainbackend.Testcase;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mainbackend.dao.CategoryDao;
import com.niit.mainbackend.model.Category;

public class TestCase {

	@Autowired
	static
	AnnotationConfigApplicationContext context;
	@Autowired
	static
    Category category;
	@Autowired
	static
	CategoryDao categoryDao;
@BeforeClass

public static void init()
{
	context = new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	categoryDao=(CategoryDao) context.getBean("categoryDao");
	category= (Category) context.getBean("category");
	System.out.println("The object is created");
}

//start writing Junit test case
//for each method defined in DAO
//@Test to make it as test case
@Test
public void createCategoryTestcase()
{
	category.setId("A003");
	category.setDescription("This is category 3");
	category.setName("RAM category");
	
	Boolean status= categoryDao.create(category);
	
	Assert.assertEquals("create category test case", false,status);
	
}
@Test
public void deleteCategoryTestcase()
{
	category.setId("C001");
		Boolean status= categoryDao.delete(category);
	
	Assert.assertEquals("create category test case", false,status);
	
}

}
