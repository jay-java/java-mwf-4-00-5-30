package OOPS;
class Overloading{
	Overloading(){
		
	}
	Overloading(String name){
		
	}
	Overloading(int i){
		
	}
	public void show(int i) {
		System.out.println("hello show method 1 ");
	}
	public void show(int i,int j) {
		System.out.println("hello show method 2");
	}
}
public class CompileTime {
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.show(1);
	}
}
