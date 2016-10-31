package com.niit.artzonbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {
public static void main(String args[])
{
	AnnotationConfigApplicationContext obj=new AnnotationConfigApplicationContext();
	obj.scan("com.niit.artzonbackend.model");
	obj.refresh();
	obj.getBean("c2");
	System.out.println("The product instance is created");
	
}
}
