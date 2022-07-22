package demo;
import java.util.Scanner;
class demo {
	public void run() {
		System.out.println("this is run method");
	}
}
public class First {
	public static void main(String[] args) {
		demo d = new demo();
		d.run();
		System.out.print("hello world");
		System.out.println("hello java");
		System.out.println("hello \"java\" again");
		// 1.int 2.byte 3.short 4.long 5.char 6.boolean 7.float 8.double
		int i, j;
		Scanner sc = new Scanner(System.in);
//		System.out.print("enter value of i = ");
//		i = sc.nextInt();
//		System.out.print("enter value pf j = ");
//		j = sc.nextInt();
//		System.out.println("i = " + i);
//		System.out.println("j = " + j);
//		int k = i + j;
//		System.out.println("addition of i and j = " + k);
//		System.out.println("enter per = ");
//		float per = sc.nextFloat();
//		System.out.println(per);
		System.out.print("enter character : ");
		char c = sc.next().charAt(0);
		System.out.println(c);
		System.out.println("enter string : ");
		String name = sc.next();
		System.out.println(name);
	}
}
