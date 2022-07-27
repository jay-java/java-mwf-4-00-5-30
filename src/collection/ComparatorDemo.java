package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp {
	int salary;
	String name;

	Emp(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp : salary :" + salary + " name : " + name;
	}
}

public class ComparatorDemo  {
	public static void main(String[] args) {
		Emp e1 = new Emp(70000, "a");
		Emp e2 = new Emp(50000, "b");
		Emp e3 = new Emp(90000, "c");
		List<Emp> list = new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		
		Comparator<Emp> com = new Comparator<Emp>() {
			
			@Override
			public int compare(Emp o1, Emp o2) {
				if(o1.salary > o2.salary) {
				return 1;
				}
				else {
					return -1;
				}
			}
		};
		Collections.sort(list, com);
		for(Emp e:list) {
			System.out.println(e);
		}
	}
}
