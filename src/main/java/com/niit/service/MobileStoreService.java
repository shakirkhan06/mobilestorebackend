package com.niit.service;
/*package mobilestorebackend.service;

import java.util.List;

import mobilestorebackend.dao.MobileStoreDao;
import mobilestorebackend.dao.impl.MobileStoreDaoImpl;
import mobilestorebackend.model.MobileStore;

public class MobileStoreService {
	private static MobileStoreDaoImpl mobileStoredaoImpl;

	public MobileStoreService()
	{
		mobileStoredaoImpl=new MobileStoreDaoImpl();
	}
	public void persist(MobileStore mobilestore) 
	{
		mobileStoredaoImpl.openCurrentSessionwithTransaction();
		mobileStoredaoImpl.persist(mobilestore);
		mobileStoredaoImpl.closeCurrentSessionwithTransaction();
	}
	public void updateMobileStore(MobileStore mobilestore) 
	{
		mobileStoredaoImpl.openCurrentSessionwithTransaction();
		mobileStoredaoImpl.updateMobileStore(mobilestore);
		mobileStoredaoImpl.closeCurrentSessionwithTransaction();
	}
	public MobileStore findMobileStore(int Pro_id) 
	{
		mobileStoredaoImpl.openCurrentSession();
		MobileStore mobilestore =mobileStoredaoImpl.findMobileStore(Pro_id);
		mobileStoredaoImpl.closeCurrentSession();
		return mobilestore;
	}
	public List<MobileStore> findMobileStoreAll() 
	{
		mobileStoredaoImpl.openCurrentSession();
		 List<MobileStore> mobilestore = mobileStoredaoImpl.findMobileStoreAll();
		mobileStoredaoImpl.closeCurrentSession();
		return mobilestore;
	}
	public void deleteMobileStore(int Pro_id) 
	{
		mobileStoredaoImpl.openCurrentSessionwithTransaction();
		MobileStore mobilestore = mobileStoredaoImpl.findMobileStore(Pro_id);
		mobileStoredaoImpl.deleteMobileStore(mobilestore);
		mobileStoredaoImpl.closeCurrentSessionwithTransaction();
	}
	public void deleteMobileStoreAll(MobileStore mobilestore) 
	{
		mobileStoredaoImpl.openCurrentSessionwithTransaction();
		mobileStoredaoImpl.deleteMobileStoreAll();
		mobileStoredaoImpl.closeCurrentSessionwithTransaction();
	}
	


}
*/