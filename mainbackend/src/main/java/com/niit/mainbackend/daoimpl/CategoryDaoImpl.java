package com.niit.mainbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mainbackend.dao.CategoryDao;
import com.niit.mainbackend.model.Category;
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory = null;

	public CategoryDaoImpl(SessionFactory sessionFactory){
		
		this.sessionFactory=sessionFactory;
		
	}
	@Transactional
		public boolean create(Category category) {
			try {
				sessionFactory.openSession().save(category);
				return true;
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return false;
		}

	@Transactional
	public boolean update(Category category) {
		try {
			sessionFactory.openSession().update(category);
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Transactional
	public boolean delete(Category category) {
		try {
			sessionFactory.openSession().delete(category);
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	@Transactional
		public Category get(String id) {
			
			
			return (Category) sessionFactory.openSession().get(Category.class, id);
		}

		public List<Category> list() {
			String hql= "from Category";
			Query query= sessionFactory.openSession().createQuery(hql);
			return query.list();
		}
		}

		


