package com.niit.artzonbackend.dao;

import java.util.List;

import com.niit.artzonbackend.model.Supplier;

public interface SupplierDAO {
	Supplier get (String id);
	List<Supplier> list();
	
	boolean save(Supplier suplier);
	boolean delete(Supplier suplier);
	boolean update(Supplier suplier);
	

}
