package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
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
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
