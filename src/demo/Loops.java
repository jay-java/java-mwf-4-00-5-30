package demo;

public class Loops {
	public static void main(String[] args) {
		System.out.println("for loop");
		for(int i=6;i<=5;i++) {
			System.out.println("i = "+i);
		}
		System.out.println("while loop");
		int j=6;
		while(j<=5) {
			System.out.println("j = "+j);
			j++;
		}
		System.out.println("do while loop");
		int k=6;
		do {
			System.out.println("k = "+k);
			k++;
		}
		while(k<=5);
	}
}
