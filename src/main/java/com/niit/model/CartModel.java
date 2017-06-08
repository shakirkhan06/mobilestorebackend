package com.niit.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name="CartDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "cartid")})
public class CartModel implements Serializable{ 
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="cartid")//defining the database column
    private int cartid;
	@OneToOne
	@JoinColumn(name="prodId")
	private ProductsModel prodId;
	//private SupplierModel suplierid;
	//private UserModel userid;
	@Column(name="prices")
	private int prices;
	@Column(name="quantity")
	private int quantity;
	
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
		
	public ProductsModel getProdId() {
		return prodId;
	}
	public void setProdId(ProductsModel prodId) {
		this.prodId = prodId;
	}
	
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) {
		this.prices = prices;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}