package orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("orm/config.xml");
		Model m = new Model(1, "java", "xyz");
		Dao d = (Dao)con.getBean("dao");
		int i = d.insertModel(m);
		System.out.println("saved : "+i);
	}
}
