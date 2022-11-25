package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private int id;
	private String name;
	private List<Long> moNO;
	private Set<Long> acc;
	private Map<String, Double> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getMoNO() {
		return moNO;
	}
	public void setMoNO(List<Long> moNO) {
		this.moNO = moNO;
	}
	public Set<Long> getAcc() {
		return acc;
	}
	public void setAcc(Set<Long> acc) {
		this.acc = acc;
	}
	public Map<String, Double> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Double> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", moNO=" + moNO + ", acc=" + acc + ", courses=" + courses + "]";
	}
	
}
