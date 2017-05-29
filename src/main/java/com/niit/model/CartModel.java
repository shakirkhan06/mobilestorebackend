package com.niit.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;

@Table(name="CartDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "cart_Id")})
public class CartModel implements Serializable{ 
	@Id
	@Column(name="cart_Id")
	private Integer cart_Id;
	@Column(name="cart_Supplier_Id")
	private Integer cart_Supplier_Id;
	@Column(name="cart_Product_Id")
	private Integer cart_Product_Id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_Id")
	private UserModel user_Id;
	@Column(name="cart_Price")
	private int cart_Price;
	@Column(name="cart_Quantity")
	private int cart_Quantity;
	@Column(name="cart_Status")
	private String cart_Status;
	public Integer getCartId() {
		return cart_Id;
	}
	public void setCartId(Integer cartId) {
		this.cart_Id = cartId;
	}
	public Integer getCartSupplierId() {
		return cart_Supplier_Id;
	}
	public void setCartSupplierId(Integer cartSupplierId) {
		this.cart_Supplier_Id = cartSupplierId;
	}
	public Integer getCartProductId() {
		return cart_Product_Id;
	}
	public void setCartProductId(Integer cartProductId) {
		this.cart_Product_Id = cartProductId;
	}
	public UserModel getCartUserDetails() {
		return user_Id;
	}
	public void setCartUserDetails(UserModel cartUserDetails) {
		this.user_Id = cartUserDetails;
	}
	public int getCartPrice() {
		return cart_Price;
	}
	public void setCartPrice(int cartPrice) {
		this.cart_Price = cartPrice;
	}
	public int getCartQuantity() {
		return cart_Quantity;
	}
	public void setCartQuantity(int cartQuantity) {
		this.cart_Quantity = cartQuantity;
	}
	public String getCartStatus() {
		return cart_Status;
	}
	public void setCartStatus(String cartStatus) {
		this.cart_Status = cartStatus;
	}
	
	
	}
