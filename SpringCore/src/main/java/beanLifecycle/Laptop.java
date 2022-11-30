package beanLifecycle;

public class Laptop {
	private int ram;
	private String model;
	
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", model=" + model + "]";
	}
	
	public void beanStarted() {
		System.out.println("Bean started");
	}
	public void beanDestroyed() {
		System.out.println("bean destroyed");
	}
}
