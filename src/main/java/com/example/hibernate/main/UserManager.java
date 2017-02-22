package com.example.hibernate.main;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.model.Address;
import com.example.hibernate.model.User;
import com.example.hibernate.service.UserService;
import com.example.hibernate.service.UserServiceImpl;

public class UserManager {

	public static void main(String [] args)
	{
		UserService userService  = new UserServiceImpl();
		Address address = new Address();
		address.setCountry("India");
		address.setStreetName("Ramannapet");
		address.setZipCode("522007");
		User user = new User();
		user.setUserName("Siva");
		user.setUserId(1);
		user.setAddress(address);
		
	    userService.save(user);
	 
	
	}
}
