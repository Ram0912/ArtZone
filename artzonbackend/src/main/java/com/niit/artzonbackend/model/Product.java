package com.niit.artzonbackend.model;

import org.springframework.stereotype.Component;

@Component("c2") // to create a instance of class
public class Product{
private String id;
private String name;
private String price;
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
private String description;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
