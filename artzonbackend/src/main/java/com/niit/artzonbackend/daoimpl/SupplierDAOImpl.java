package com.niit.artzonbackend.daoimpl;

import java.util.List;



import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.artzonbackend.dao.SupplierDAO;
import com.niit.artzonbackend.model.Supplier;

public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Supplier get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Supplier> list() {
		// TODO Auto-generated method stub
		String hql="fromSupplier";
		Query query=sessionFactory.openSession().createQuery(hql);
		return  query.list();
	}
	public boolean save(Supplier suplier) {
		// TODO Auto-generated method stub
		return false;
	}
 
	public boolean delete(Supplier suplier) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Supplier suplier) {
		// TODO Auto-generated method stub
		return false;
	}

}
