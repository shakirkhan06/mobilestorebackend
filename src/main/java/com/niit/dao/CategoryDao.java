package com.niit.dao;

import java.util.List;

import com.niit.model.CategoryModel;

public interface CategoryDao {
	//Method for reading all category details
		List<CategoryModel> getAllCategoryDetails();
		/*//Method for reading single category details
		CategoryModel getCategoryDetail(int id);
		//Method for updating a category details
		void updateCategoryDetail(CategoryModel obj);*/
		//Method for adding a category details
		void addCategory(CategoryModel obj);
		/*//Method for deleting a category details
		void deleteCategory(int catId);*/
}
