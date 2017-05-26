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
import com.niit.dao.MobileStoreDao;
import com.niit.model.MobileStore;

public class MobileStoreDaoImpl implements MobileStoreDao {

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
     @Override
 	public List<MobileStore> findAllProduct() {
 		List<MobileStore> products = (List<MobileStore>) getCurrentSession().createQuery("from MobileStore").list();
         return products;
 	}
     public MobileStore findProduct(int Pro_id){
 		MobileStore products=(MobileStore) getCurrentSession().get(MobileStore.class, Pro_id);

 		return products;
 	}
     @Override
 	public void updateProduct(MobileStore objs) {
 		getCurrentSession().update(objs);

 	}
	@Override
	public void addProduct(MobileStore objs) 
	{
		getCurrentSession().save(objs);
	}
	
	@Override
	public void deleteProduct(MobileStore objs) {
		// TODO Auto-generated method stub
		//mobilestores.remove(mobilestore);
		getCurrentSession().delete(objs);
	}
	@Override
	public void deleteAllProduct() {
		List<MobileStore> entityList = findAllProduct();
        for (MobileStore mobilestore : entityList) {
        	deleteProduct(mobilestore);
        }

	}

	



}
