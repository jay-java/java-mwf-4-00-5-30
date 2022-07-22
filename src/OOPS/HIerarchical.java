package OOPS;
class D{
	public void classD() {
		System.out.println("class D");
	}
}
class E extends D{
	public void classE() {
		System.out.println("class D");
	}
}
class F extends D{
	public void classF() {
		System.out.println("class F");
	}
}
public class HIerarchical {
	public static void main(String[] args) {
		E e = new E();
		e.classD();
		e.classE();
		F f = new F();
		f.classD();
		f.classF();
	}
}
