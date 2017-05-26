package com.niit.dao;

import java.util.List;

import com.niit.model.MobileStore;
import com.niit.model.User;

public interface UserDao {
	  public User findUser(int User_id);
	   public List<User> findAllUser();
	   public void updateUser(User user);
	   public void deleteUser(User user);
	   public void deleteAllUser();
	   public void addUser(User user);
}
