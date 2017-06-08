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
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="UserDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "user_Id"),
		@UniqueConstraint(columnNames = "user_MailId") })
public class UserModel implements Serializable { 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull(message="Please fill all Data")
	@Column(name="user_Id")
	private long user_Id;
	@NotNull(message="Please fill all Data")
    @NotEmpty
	@Column(name="user_Name")
	private String userName;
	@NotNull(message="Please fill all Data")
    @NotEmpty
	@Column(name="user_Password")
	private String userPassword;
	@NotNull(message="Please fill all Data")
    @NotEmpty
	@Column(name="user_Address")
	private String user_Address;
	@NotNull(message="Please fill all Data")
    @NotEmpty
	@Column(name="user_MailId")
	private String userMailId;
	@NotNull(message="Please fill all Data")
    @NotEmpty
	@Column(name="user_Age")
	private String userAge;
	@NotNull(message="Please fill all Data")
    @NotEmpty
	@Column(name="user_Phone")
	private String user_Phone;
	@NotNull(message="Please fill all Data")
    @NotEmpty
	@Column(name="user_Gender")
	private String user_Gender;
	/*@Column(name="user_Cart_Id")
	private Integer userCartId;*/
	@Column(name="user_Orders")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orderUserDetails")
	private Set<OrdersModel> userOrders = new HashSet<OrdersModel>(0);
	@Column(name="user_Role")
	private String userRole;
	@Column(name="enabled")
	private boolean enabled;

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUser_Address() {
		return user_Address;
	}

	public void setUser_Address(String user_Address) {
		this.user_Address = user_Address;
	}

	public String getUserMailId() {
		return userMailId;
	}

	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUser_Phone() {
		return user_Phone;
	}

	public void setUser_Phone(String user_Phone) {
		this.user_Phone = user_Phone;
	}

	public String getUser_Gender() {
		return user_Gender;
	}

	public void setUser_Gender(String user_Gender) {
		this.user_Gender = user_Gender;
	}

	/*public Integer getUserCartId() {
		return userCartId;
	}

	public void setUserCartId(Integer userCartId) {
		this.userCartId = userCartId;
	}*/

	public Set<OrdersModel> getUserOrders() {
		return userOrders;
	}

	public void setUserOrders(Set<OrdersModel> userOrders) {
		this.userOrders = userOrders;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UserModel(int user_Id, String userName, String userPassword, String user_Address, String userMailId,
			String userAge, String user_Phone, String user_Gender, Set<OrdersModel> userOrders,
			String userRole, boolean enabled) {
		super();
		this.user_Id = user_Id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.user_Address = user_Address;
		this.userMailId = userMailId;
		this.userAge = userAge;
		this.user_Phone = user_Phone;
		this.user_Gender = user_Gender;
		//this.userCartId = userCartId;
		this.userOrders = userOrders;
		this.userRole = userRole;
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "UserModel [user_Id=" + user_Id + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", user_Address=" + user_Address + ", userMailId=" + userMailId + ", userAge=" + userAge
				+ ", user_Phone=" + user_Phone + ", user_Gender=" + user_Gender + ", userOrders=" + userOrders
				+ ", userRole=" + userRole + ", enabled=" + enabled + "]";
	}
	
	
	
}
