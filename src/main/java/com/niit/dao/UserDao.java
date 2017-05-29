package com.niit.dao;

import java.util.List;

import com.niit.model.UserModel;

public interface UserDao {
	  public UserModel findUser(int User_id);
	   public List<UserModel> findAllUser();
	   public void updateUser(UserModel user);
	   public void deleteUser(UserModel user);
	   public void deleteAllUser();
	   public void addUser(UserModel user);
}
