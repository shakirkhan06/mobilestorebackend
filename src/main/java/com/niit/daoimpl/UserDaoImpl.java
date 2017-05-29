package com.niit.daoimpl;

/*

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.niit.dao.UserDao;
import com.niit.model.UserModel;

//@Repository("userDao")
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
  	public List<UserModel> findAllUser() {
  		List<UserModel> users = (List<UserModel>) getCurrentSession().createQuery("from UserTable").list();
          return users;
  	}
      public UserModel findUser(int Pro_id){
  		UserModel users=(UserModel) getCurrentSession().get(UserModel.class, Pro_id);

  		return users;
  	}
      @Override
  	public void updateUser(UserModel objs) {
  		getCurrentSession().update(objs);

  	}
 	@Override
 	public void addUser(UserModel objs) 
 	{
 		getCurrentSession().save(objs);
 	}
 	
 	@Override
 	public void deleteUser(UserModel objs) {
 		// TODO Auto-generated method stub
 		//mobilestores.remove(mobilestore);
 		getCurrentSession().delete(objs);
 	}
 	@Override
 	public void deleteAllUser() {
 		List<UserModel> entityList = findAllUser();
         for (UserModel mobilestore : entityList) {
         	deleteUser(mobilestore);
         }

 	}



	
	

}
*/