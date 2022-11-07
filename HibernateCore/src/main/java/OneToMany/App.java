package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx  = session.beginTransaction();
		
		Teacher t1 = new Teacher();
		t1.setId(1);
		t1.setName("xyz");
		
		Students s1 = new Students();
		s1.setId(1);
		s1.setName("a");

		Students s2 = new Students();
		s2.setId(2);
		s2.setName("b");

		Students s3 = new Students();
		s3.setId(3);
		s3.setName("c");
		
		
		s1.setTeacher(t1);
		s2.setTeacher(t1);
		s3.setTeacher(t1);

		List<Students> list =  new ArrayList<Students>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		t1.setStudents(list);
		
		session.save(t1);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
