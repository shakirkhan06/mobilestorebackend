package com.niit.daoimpl;

/*import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.niit.dao.CartDao;
import com.niit.model.CartModel;

@Repository
public class CartDaoImpl implements CartDao{
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
	public List<CartModel> findAllCart() {
		List<CartModel> carts = (List<CartModel>) getCurrentSession().createQuery("from CartTable").list();
		return carts;
	}
	public CartModel findCart(int Pro_id){
		CartModel carts=(CartModel) getCurrentSession().get(CartModel.class, Pro_id);

		return carts;
	}
	@Override
	public void updateCart(CartModel objs) {
		getCurrentSession().update(objs);

	}
	@Override
	public void addCart(CartModel objs) 
	{
		getCurrentSession().save(objs);
	}

	@Override
	public void deleteCart(CartModel objs) {
		// TODO Auto-generated method stub
		//mobilestores.remove(mobilestore);
		getCurrentSession().delete(objs);
	}
	@Override
	public void deleteAllCart() {
		List<CartModel> entityList = findAllCart();
		for (CartModel carts : entityList) {
			deleteCart(carts);
		}

	}






}
*/