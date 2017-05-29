package com.niit.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="UserDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "user_Id"),
		@UniqueConstraint(columnNames = "user_MailId") })
public class UserModel implements Serializable { 
	@Id
	@Column(name="user_Id")
	private Integer user_Id;
	@Column(name="user_MailId")
	private String userMailId;
	@Column(name="user_FirstName")
	private String userFirstName;
	@Column(name="user_LastName")
	private String userLastName;
	@Column(name="user_Password")
	private String userPassword;
	@Column(name="user_Cart_Id")
	private Integer userCartId;
	@Column(name="user_Orders")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orderUserDetails")
	private Set<OrdersModel> userOrders = new HashSet<OrdersModel>(0);
	@Column(name="user_Role")
	private String userRole;
	
	public UserModel(Integer userId, String userMailId, String userFirstName, String userLastName, String userPassword,
			Integer userCartId, Set<OrdersModel> userOrders, String userRole) {
		super();
		this.user_Id = userId;
		this.userMailId = userMailId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userPassword = userPassword;
		this.userCartId = userCartId;
		this.userOrders = userOrders;
		this.userRole = userRole;
	}

	public UserModel()
	{
		
	}
}
