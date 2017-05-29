package com.niit.daoimpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CategoryDao;

import com.niit.model.CategoryModel;

public class CategoryDaoImpl implements CategoryDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDaoImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory=sessionFactory;
	}
	public List<CategoryModel> getAllCategoryDetails() {
		Session session=sessionFactory.openSession();
		List<CategoryModel> products =null;
		session.beginTransaction();
		products= session.createQuery("from CategoryModel").list();   
		session.getTransaction().commit();
		  return products;
	}
/*
	public CategoryModel getCategoryDetail(int id) {
		CategoryModel product = (CategoryModel) getCurrentSession().get(CategoryModel.class, id);

        return product;
	}

	public void updateCategoryDetail(CategoryModel obj) {
		getCurrentSession().update(obj);
		
	}*/

	public void addCategory(CategoryModel obj) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(obj);
		session.getTransaction().commit();
		
	}

	/*public void deleteCategory(int catId) {
		getCurrentSession().delete(catId);
		
	}*/
	
}