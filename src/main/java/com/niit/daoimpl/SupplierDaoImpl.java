package com.niit.daoimpl;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.dao.SupplierDao;
import com.niit.model.CategoryModel;
import com.niit.model.SupplierModel;


public class SupplierDaoImpl implements SupplierDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	public SupplierDaoImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory=sessionFactory;
	}
	public List<SupplierModel> getAllCategoryDetails() {
		Session session=sessionFactory.openSession();
		List<SupplierModel> products =null;
		session.beginTransaction();
		products= session.createQuery("from SupplierModel").list();   
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

	public void addSupplier(SupplierModel obj) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(obj);
		session.getTransaction().commit();
		
	}


	/*public void deleteCategory(int catId) {
		getCurrentSession().delete(catId);
		
	}*/
	
}