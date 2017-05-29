package com.niit.dao;

import java.util.List;

import com.niit.model.SupplierModel;

public interface SupplierDao {

	//Method for reading all category details
			List<SupplierModel> getAllCategoryDetails();
			/*//Method for reading single category details
			CategoryModel getCategoryDetail(int id);
			//Method for updating a category details
			void updateCategoryDetail(CategoryModel obj);*/
			//Method for adding a category details
			void addSupplier(SupplierModel obj);
			/*//Method for deleting a category details
			void deleteCategory(int catId);*/
}
