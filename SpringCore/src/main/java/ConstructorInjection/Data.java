package ConstructorInjection;

public class Data {
	private int a;
	private int b;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(int a, int b) {
		super();
		System.out.println("setting values by integer constructor");
		this.a = a;
		this.b = b;
	}
	
	public Data(String a, String b) {
		super();
		System.out.println("setting values by String constructor");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	public Data(double a, double b) {
		super();
		System.out.println("setting values by double constructor");
		this.a = (int)a;
		this.b = (int)b;
	}

	@Override
	public String toString() {
		return "Data [a=" + a + ", b=" + b + "]";
	}
	
}
