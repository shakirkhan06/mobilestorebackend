package com.niit.dao;

import java.util.List;

import com.niit.model.MobileStore;


public interface MobileStoreDao
{
	   public MobileStore findProduct(int pro_id);
	   public List<MobileStore> findAllProduct();
	   public void updateProduct(MobileStore mobilestore);
	   public void deleteProduct(MobileStore mobilestore);
	   public void deleteAllProduct();
	   public void addProduct(MobileStore mobilestore);
	
}
