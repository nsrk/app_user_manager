package com.example.hibernate.service;

import org.hibernate.Session;

import com.example.hibernate.model.User;

public interface UserService {

	public void save(User user);
}
