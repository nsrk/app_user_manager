package com.example.hibernate.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
/*This class embedds address object which is a value object*/
@Entity
public class User {
	@Id
	private int userId;
	
	private String userName;
	@Embedded
	private Address address;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
