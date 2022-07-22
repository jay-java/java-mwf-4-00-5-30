package OOPS;
class Overriding{
	public void show() {
		System.out.println("overriding class");
	}
}
class Call extends Overriding{
	public void show() {
		super.show();
		System.out.println("call class");
	}
}
public class Runtime {
	public static void main(String[] args) {
		Call c = new Call();
		c.show();
		c.show();
	}
}
