package com.maxtrain.bootcamp.spring.taskmanager.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="Users", uniqueConstraints=@UniqueConstraint(name="UDIX_code", columnNames = {"username"}))
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=30, nullable=false)
	private String userName;
	@Column(length=30, nullable=false)
	private String password;
	@Column(length =30, nullable=false)
	private String firstName;
	@Column(length =30, nullable=false)
	private String lastName;
	@Column(length=255, nullable=true)
	private String email;
	@Column(length=12, nullable=true)
	private String phoneNumber;
	@Column(columnDefinition="bit not null default 0")
	private boolean isAdmin;
	@Column(columnDefinition="bit not null default 0")
	private boolean isManager;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public boolean getIsManager() {
		return isManager;
	}
	public void setIsManager(boolean isManager) {
		this.isManager = isManager;
	}	
	
	
}
