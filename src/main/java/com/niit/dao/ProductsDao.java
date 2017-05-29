package com.niit.dao;

import java.util.List;

import com.niit.model.ProductsModel;


public interface ProductsDao
{
	   public ProductsModel findProduct(int pro_id);
	   public List<ProductsModel> findAllProduct();
	   public void updateProduct(ProductsModel mobilestore);
	   public void deleteProduct(ProductsModel mobilestore);
	   public void deleteAllProduct();
	   public void addProduct(ProductsModel mobilestore);
	
}
