package com.core.HibernateCore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx  = session.beginTransaction();
		User u = session.get(User.class, 1);
		session.delete(u);
		
//		User u = new User(2, "java", "delhi");
//		session.update(u);
		
//		User u = session.get(User.class, 3);
//		System.out.println(u);
		
//		User u = new User(2, "name2", "ahmedabad");
//		session.save(u);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
