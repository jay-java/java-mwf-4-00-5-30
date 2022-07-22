package OOPS;
final class Emp{
	final int id = 1;
	String name;
	final public void show() {
//		id =2;
		System.out.println("id = "+id);
	}
}
class EmpCall extends Emp{
	public void show() {
		System.out.println("show inside emp call");
	}
}
public class finalKeyword {
	public static void main(String[] args) {
		Emp e= new Emp();
		e.show();
	}
}
