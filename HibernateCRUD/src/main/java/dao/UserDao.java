package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connection.DBConnection;
import model.User;

public class UserDao {
	Session session = null;
	Transaction tx = null;
	SessionFactory sf = null;
	public void insertUser(User u) {
		try {
			session = new DBConnection().getSession();
			tx = session.beginTransaction();
			session.save(u);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
