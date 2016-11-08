package com.niit.artzonbackend;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {

	
	@Autowired
	AnnotationConfigApplicationContext context;
	
	@Autowired
	category category;
	@Autowired
	CategoryDAO categoryDAO;
	
	public void init()
	{
		context=new AnnotationconfigApplicationContext();
		context.scan("com.niit.);
	}
	
	

}
