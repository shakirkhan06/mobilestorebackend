package com.niit.dao;

import java.util.List;

import com.niit.model.CartModel;

public interface CartDao {
	  public CartModel findCart(int cartId);
	   public List<CartModel> findAllCart();
	   public void updateCart(CartModel cart);
	   public void deleteCart(CartModel cart);
	   public void deleteAllCart();
	   public void addCart(CartModel cart);
}
