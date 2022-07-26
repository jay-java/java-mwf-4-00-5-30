package collection;

import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id = "+id+" name = "+name;
	}
}
public class LIstPractical {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Romit");
		Student s2 = new Student(2, "Zankhana");
		Student s3 = new Student(3, "Dhruvi");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
	}
	
}
