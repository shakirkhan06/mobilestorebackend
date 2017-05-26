package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "MobileStore")
public class MobileStore {

	@Id
	@Column(name = "pro_id")
	private int pro_id;
	@Column(name = "pro_name")
	private String pro_name;
	@Column(name = "pro_catagory")
	private String pro_catagory;
	@Column(name = "pro_brand")
	private String pro_brand;
	@Column(name = "pro_model")
	private String pro_model;
	@Column(name = "pro_price")
	private int pro_price;
	@Column(name = "pro_quantity")
	private int pro_quantity;
	@Column(name = "pro_supplier")
	private String pro_supplier;
	@Column(name = "pro_desc")
	private String pro_desc;
	//private List<Part> pro_image;
	
	public MobileStore(int pro_id, String pro_name, String pro_catagory, String pro_brand, String pro_model,
			int pro_price, int pro_quantity, String pro_supplier, String pro_desc) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_catagory = pro_catagory;
		this.pro_brand = pro_brand;
		this.pro_model = pro_model;
		this.pro_price = pro_price;
		this.pro_quantity = pro_quantity;
		this.pro_supplier = pro_supplier;
		this.pro_desc = pro_desc;
		//this.pro_image = pro_image;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_catagory() {
		return pro_catagory;
	}
	public void setPro_catagory(String pro_catagory) {
		this.pro_catagory = pro_catagory;
	}
	public String getPro_brand() {
		return pro_brand;
	}
	public void setPro_brand(String pro_brand) {
		this.pro_brand = pro_brand;
	}
	public String getPro_model() {
		return pro_model;
	}
	public void setPro_model(String pro_model) {
		this.pro_model = pro_model;
	}
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public int getPro_quantity() {
		return pro_quantity;
	}
	public void setPro_quantity(int pro_quantity) {
		this.pro_quantity = pro_quantity;
	}
	public String getPro_supplier() {
		return pro_supplier;
	}
	public void setPro_supplier(String pro_supplier) {
		this.pro_supplier = pro_supplier;
	}
	public String getPro_desc() {
		return pro_desc;
	}
	public void setPro_desc(String pro_desc) {
		this.pro_desc = pro_desc;
	}
	//public List<Part> getPro_image() {
	//	return pro_image;
	//}
	//public void setPro_image(List<Part> pro_image) {
	//	this.pro_image = pro_image;
	//}
	/*@Override
	public String toString() {
		return "MobileStore [pro_id=" + pro_id + ", pro_name=" + pro_name + ", pro_catagory=" + pro_catagory
				+ ", pro_brand=" + pro_brand + ", pro_model=" + pro_model + ", pro_price=" + pro_price
				+ ", pro_quantity=" + pro_quantity + ", pro_supplier=" + pro_supplier + ", pro_desc=" + pro_desc + "]";
	}*/
	
	
}