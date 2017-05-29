package com.niit.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.niit.config.*;
import com.niit.dao.ProductsDao;
import com.niit.model.ProductsModel;

public class ProductsDaoImpl implements ProductsDao {

	private Session currentSession;
	private Transaction currentTransaction;

	public Session openCurrentSession() {
	    currentSession = getSessionFactory().openSession();
	    return currentSession;
    }
	
	public Session openCurrentSessionwithTransaction() {
			currentSession = getSessionFactory().openSession();
			currentTransaction = currentSession.beginTransaction();
			return currentSession;
	}

    public void closeCurrentSession() {
    		currentSession.close();
    }
    
     public void closeCurrentSessionwithTransaction() {
         	currentTransaction.commit();
         	currentSession.close();
     }
     
	 private static SessionFactory getSessionFactory() {
		     
             Configuration configuration = new Configuration().configure();
             StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
             SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
             return sessionFactory;
     }
	
	    public Session getCurrentSession() {
		 	return currentSession;
     }

    public void setCurrentSession(Session currentSession) {
        	this.currentSession = currentSession;
     }

    public Transaction getCurrentTransaction() {
             return currentTransaction;
     }

     public void setCurrentTransaction(Transaction currentTransaction) {
    	 	this.currentTransaction = currentTransaction;
    }
     public List<ProductsModel> findAllProduct() {
 		List<ProductsModel> products = (List<ProductsModel>) getCurrentSession().createQuery("from MobileStore").list();
         return products;
 	}
     public ProductsModel findProduct(int Pro_id){
 		ProductsModel products=(ProductsModel) getCurrentSession().get(ProductsModel.class, Pro_id);

 		return products;
 	}
     public void updateProduct(ProductsModel objs) {
 		getCurrentSession().update(objs);

 	}
	public void addProduct(ProductsModel objs) 
	{
		getCurrentSession().saveOrUpdate(objs);
	}
	
	public void deleteProduct(ProductsModel objs) {
		// TODO Auto-generated method stub
		//mobilestores.remove(mobilestore);
		getCurrentSession().delete(objs);
	}
	public void deleteAllProduct() {
		List<ProductsModel> entityList = findAllProduct();
        for (ProductsModel mobilestore : entityList) {
        	deleteProduct(mobilestore);
        }

	}

	



}
