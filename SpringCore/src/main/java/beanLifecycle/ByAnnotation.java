package beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ByAnnotation {
	private int id;
	private String name;
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
	@Override
	public String toString() {
		return "ByAnnotation [id=" + id + ", name=" + name + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("start");
	}
	@PreDestroy
	public void stop() {
		System.out.println("stopped");
	}
}
