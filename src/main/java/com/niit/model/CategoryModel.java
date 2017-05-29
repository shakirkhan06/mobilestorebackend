package com.niit.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="CategoryDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "category_Id")})
public class CategoryModel implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="category_Id")
	private Integer categoryId;
	@Column(name="category_Name")
	private String categoryName;
	@OneToMany(mappedBy = "prodCategory",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@Column(name="category_Products")
	private Set<ProductsModel> categoryProducts=new HashSet<ProductsModel>(
			0);

	public CategoryModel()
	{
		
	}
	/*public CategoryModel(Integer categoryId,String categoryName)
	{
		this.categoryId=categoryId;
		this.categoryName=categoryName;
		this.categoryProducts=null;
	}*/
    public CategoryModel(Integer categoryId, String categoryName, Set<ProductsModel> categoryProducts) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryProducts = categoryProducts;
	}
	//Getter and Setter methods for Product Quantity
    public void setCategoryId(Integer categoryId)
	{
		this.categoryId=categoryId;
	}
    @Column(name = "category_Id", unique = true, nullable = false)
    public Integer getCategoryId()
    {
    	return this.categoryId;
    }
    
    //Getter and Setter methods for Product Category
    public void setCategoryName(String categoryName)
	{
		this.categoryName=categoryName;
	}
    public String getCategoryName()
    {
    	return this.categoryName;
    }
    
    //Getter and Setter methods for Product Supplier
  
    public void setCategoryProducts(Set<ProductsModel> categoryProducts)
	{
		this.categoryProducts=categoryProducts;
	}
    
 
    public Set<ProductsModel> getCategoryProducts()
    {
    	return this.categoryProducts;
    }
}
