package OOPS;

import java.util.Scanner;

class Data{
	private int i;
	private String name;
	public Data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println("enter name = ");
		name = sc.next();
	}
	@Override
	public String toString() {
		return "i = "+i+" name = "+name;
	}
}
public class EncapsulaionDemo {
	public static void main(String[] args) {
		Data d = new Data();
//		d.i=10;
//		d.name="xyz";
		System.out.println(d);
	}
}
