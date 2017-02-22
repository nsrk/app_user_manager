package com.example.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.hibernate.model.User;

public class UserServiceImpl implements UserService {
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	public void save(User user){
			Configuration configuration  = new Configuration();
		    SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		    Session session = sessionFactory.openSession();
		    log.info("Session is created");
		    try {
				session.beginTransaction();
				log.info("transaction to save user has begun");
				session.save(user);
				session.getTransaction().commit();
				log.info("transaction is committed");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				session.getTransaction().getRollbackOnly();
				log.info("transaction is rollbacked");
			}
		    finally{
		    	session.close();
		    }
		    
	}
}
