package com.niit.model;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "Products",uniqueConstraints = {
		@UniqueConstraint(columnNames = "prodId")})
public class ProductsModel implements Serializable {

	@Id
	@Column(name="prodId")
	private String prodId;
	
	@Column(name="prod_Brand")
	private String prodBrand;
	
	@Column(name="prod_Name")
	private String prodName;
	
	@Column(name="prod_Description")
	private String prodDescription;
	
	@Column(name="prod_Price")
	private int prodPrice;
	
	@Column(name="prod_Quantity")
	private int prodQuantity;
	
	@ManyToOne
	/*@JoinColumn(name = "category_Id")*/
	@JoinColumn(name = "categoryid")
	private CategoryModel prodCategory;
	
	@ManyToOne
	@JoinColumn(name = "supplierId")
	private SupplierModel prodSupplier;
	

	/*private Set<Category> category_Ids=new HashSet<Category>(
			0);


	private Set<Supplier> supplier_Ids=new HashSet<Supplier>(
			0);*/
	
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdBrand() {
		return prodBrand;
	}
	public void setProdBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDescription() {
		return prodDescription;
	}
	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	public void setProdCategory(CategoryModel productCategory){
		this.prodCategory=productCategory;
	}
	public CategoryModel getProdCategory(){
		return prodCategory;
	}
	/*public String getProdCategoryId() {
		return category_Id;
	}
	public void setProdCategoryId(String prodCategoryId) {
		this.category_Id = prodCategoryId;
	}
	public String getProdSupplierId() {
		return supplier_Id;
	}
	public void setProdSupplierId(String prodSupplierId) {
		this.supplier_Id = prodSupplierId;
	}*/
	
	
}