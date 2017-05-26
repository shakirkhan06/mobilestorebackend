package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="User")
public class User { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserCartId() {
		return userCartId;
	}
	public void setUserCartId(String userCartId) {
		this.userCartId = userCartId;
	}
	public String getUsersetoforder() {
		return usersetoforder;
	}
	public void setUsersetoforder(String usersetoforder) {
		this.usersetoforder = usersetoforder;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@NotEmpty(message = "The username must not be empty")
    private String username;
	@NotEmpty(message = "The userEmail must not be empty")
    private String userEmail;
	@NotEmpty(message = "The password must not be empty")
    private String password;
	@NotEmpty(message = "The userMobile must not be empty")
    private String userMobile;
	@NotEmpty(message = "The userCartId must not be empty")
    private String userCartId;
	@NotEmpty(message = "The usersetoforder must not be empty")
    private String usersetoforder;
	@NotEmpty(message = "The userRole must not be empty")
    private String userRole;
	}
