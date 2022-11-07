package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Project p1 = new Project();
		p1.setId(1);
		p1.setPname("Online shopping");

		Project p2 = new Project();
		p2.setId(2);
		p2.setPname("blood bank");

		Project p3 = new Project();
		p3.setId(3);
		p3.setPname("Chat app");
		
		EMployee e1 = new EMployee();
		e1.setId(1);
		e1.setEname("abc");

		EMployee e2 = new EMployee();
		e2.setId(2);
		e2.setEname("def");

		EMployee e3 = new EMployee();
		e3.setId(3);
		e3.setEname("ghi");
		
		List<Project> plist = new ArrayList<Project>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		
		List<EMployee> elist = new ArrayList<EMployee>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		
		p1.setEmployees(elist);
		p2.setEmployees(elist);
		p3.setEmployees(elist);
		
		e1.setProjects(plist);
		e2.setProjects(plist);
		e3.setProjects(plist);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
