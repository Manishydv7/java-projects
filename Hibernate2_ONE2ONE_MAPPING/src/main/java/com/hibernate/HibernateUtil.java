package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//connection provider class HibernateUtil
public class HibernateUtil {

	private static Session session;
	public static Session getSession()
	{
		//creating a cfg object of Configuration class
		Configuration cfg=new Configuration();
		cfg.configure();
		//calling a method of buildSessionFactoru() of return type factory
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//returning session
		return session;
	}
}
