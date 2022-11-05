package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

//main class App
public class App {

	//main method
	public static void main(String[] args) {

		System.out.println("Hello world");

		//getting a connection from HibernateUtil class by a getSession() method
		Session session = HibernateUtil.getSession();
		
		//creating a Shape class instance and assigning value to its through setter method
		Shape s = new Shape();
		s.setShape_Id(11);
		//creating a Rectangle class instance and assigning value to its through setter method
		Rectangle r = new Rectangle();
		r.setShape_Id(22);
		r.setLength(11);
		r.setBreadth(12);
		//creating a Circle class instance and assigning value to its through setter method
		Circle c = new Circle();
		c.setShape_Id(33);
		c.setRadius(10);

		Transaction t = session.beginTransaction();
		session.save(s);
		session.save(r);
		session.save(c);
		t.commit();
		//closing the session reference of Session interface
		session.close();

		System.out.println("Hello world...!!");

	}
}
