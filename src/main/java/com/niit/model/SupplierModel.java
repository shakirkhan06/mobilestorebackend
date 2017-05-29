package com.niit.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="SupplierDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "supplier_Id")})
public class SupplierModel implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
  @Column(name="supplier_Id")
  
  private Integer supplierId;
  @Column(name="supplier_Name")
  private String supplierName;
  @Column(name="supplier_products")
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "prodId")
  private Set<ProductsModel> supplierproducts=new HashSet<ProductsModel>(
			0);
  
  public SupplierModel()
  {
	  
  }
  public SupplierModel(Integer supplierId,String supplierName)
  {
	  this.supplierId=supplierId;
	  this.supplierName=supplierName;
  }
  public SupplierModel(Integer supplierId,String supplierName,Set<ProductsModel> supplierproducts)
  {
	  this.supplierId=supplierId;
	  this.supplierName=supplierName;
	  this.supplierproducts=supplierproducts;
  }
//Getter and Setter methods for Product Quantity
  public void setSupplierId(Integer supplierId)
	{
		this.supplierId=supplierId;
	}
  @Column(name = "supplier_Id", unique = true, nullable = false)
  public Integer getSupplierId()
  {
  	return supplierId;
  }
  
  //Getter and Setter methods for Product Category
  public void setSupplierName(String supplierName)
	{
		this.supplierName=supplierName;
	}
  public String getSupplierName()
  {
  	return supplierName;
  }
  
  //Getter and Setter methods for Product Supplier
 
  public void setSupplierProducts(Set<ProductsModel> supplierproducts)
	{
		this.supplierproducts=supplierproducts;
	}
  
  
  public Set<ProductsModel> getSupplierProducts()
  {
  	return supplierproducts;
  }
}