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
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDao;
import com.niit.model.MobileStore;
import com.niit.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
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
  	public List<User> findAllUser() {
  		List<User> users = (List<User>) getCurrentSession().createQuery("from User").list();
          return users;
  	}
      public User findUser(int Pro_id){
  		User users=(User) getCurrentSession().get(User.class, Pro_id);

  		return users;
  	}
      @Override
  	public void updateUser(User objs) {
  		getCurrentSession().update(objs);

  	}
 	@Override
 	public void addUser(User objs) 
 	{
 		getCurrentSession().save(objs);
 	}
 	
 	@Override
 	public void deleteUser(User objs) {
 		// TODO Auto-generated method stub
 		//mobilestores.remove(mobilestore);
 		getCurrentSession().delete(objs);
 	}
 	@Override
 	public void deleteAllUser() {
 		List<User> entityList = findAllUser();
         for (User mobilestore : entityList) {
         	deleteUser(mobilestore);
         }

 	}



	
	

}
