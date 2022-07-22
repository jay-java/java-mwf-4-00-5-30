package OOPS;

class A{
	int id;
	String name;
	A(){
		System.out.println("default A construcotr");
	}
	public void classA() {
		System.out.println("this is class A method");
	}
}
class B extends A{
	public void classB() {
		System.out.println("this is class B method");
	}
	public void run() {
		
	}
}
class C extends B{
	public void classC() {
		System.out.println("this is class C method");
	}
public void run() {
		
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B b = new B();
//		b.classA();
		b.classB();
		C c =new C();
//		c.classA();
		c.classB();
		c.classC();
	}
}
