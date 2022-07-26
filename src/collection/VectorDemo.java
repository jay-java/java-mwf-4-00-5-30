package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(1);
		list.add("name");
		list.add('q');
		list.add(12.3);
		list.add(false);
		list.add(12.3);
		list.add("name2");
		list.remove(6);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		Enumeration em = list.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
