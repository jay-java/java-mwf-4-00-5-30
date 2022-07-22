package exceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

//try,catch,finally,throw,throws
public class Excep {
	public static void main(String[] args) {
		int i, j, k;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter i = ");
			i = sc.nextInt();
			System.out.println("enter j = ");
			j = sc.nextInt();
			k = i / j;
			System.out.println(k);
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
//			catch (ArithmeticException e) {
//			System.out.println("denominator cannot be zero");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator cannot be string");
//			}
		finally {
			System.out.println("this will exeucutes everytime");
		}
	}
}
