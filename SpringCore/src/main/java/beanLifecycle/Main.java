package beanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("beanLifecycle/config.xml");
		Laptop l1 = (Laptop)con.getBean("l1");
		System.out.println(l1);
		
		Emp e1 = (Emp)con.getBean("e1");
		System.out.println(e1);
		
		ByAnnotation a1 = (ByAnnotation)con.getBean("a1");
		System.out.println(a1);
		con.registerShutdownHook();
	}
}
