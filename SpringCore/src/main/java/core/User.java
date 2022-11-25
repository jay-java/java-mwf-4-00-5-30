package core;

public class User {
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setting id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("settting address");
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
