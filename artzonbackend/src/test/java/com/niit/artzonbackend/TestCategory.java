package com.niit.artzonbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {
public static void main(String args[])
{
	AnnotationConfigApplicationContext obj=new AnnotationConfigApplicationContext();
	obj.scan("com.niit.artzonbackend.model");
	obj.refresh();
	obj.getBean("c1");
	System.out.println("The category instance is created");
	
}
}
