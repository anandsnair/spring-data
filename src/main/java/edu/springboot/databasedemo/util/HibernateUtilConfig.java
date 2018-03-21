package edu.springboot.databasedemo.util;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtilConfig {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public SessionFactory getSessionFactory() {
		if(entityManagerFactory.unwrap(SessionFactory.class) == null) {
			throw new NullPointerException("factory is not a hibernate factory");
		}
		return entityManagerFactory.unwrap(SessionFactory.class);
	}
}
