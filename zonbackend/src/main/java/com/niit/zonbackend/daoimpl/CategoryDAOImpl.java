package com.niit.zonbackend.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.zonbackend.dao.CategoryDAO;
import com.niit.zonbackend.model.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(Category category) {
		
		{
			try {
				sessionFactory.getCurrentSession().save(category);
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
	}
	@Transactional
public boolean delete(Category category) {
		
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;
	}
	}
@Transactional
	public boolean update(Category category) {
		
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;
		}
		
		
	}

	@Transactional
		public Category get(String id) {
	
		return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
	}
@Transactional
	public List<Category> list() {
	
		String hql = "from Category";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}
@Transactional
	public boolean saveOrUpdate(Category category) {
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;
		}
	}

	
	}


