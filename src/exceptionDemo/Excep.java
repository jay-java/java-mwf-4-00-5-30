package exceptionDemo;
import java.util.InputMismatchException;
import java.util.Scanner;

//try,catch,finally,throw,throws
class Divide{
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println("enter j = ");
		int j = sc.nextInt();
		int k = i/j;
		System.out.println(k);
	}
}
public class Excep {
	public static void main(String[] args) {
		try {
			Divide  d= new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("cannot be zero");
		}
		catch(InputMismatchException e) {
			System.out.println("cannot be string value");
		}
		
		//		int i, j, k;
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter i = ");
//			i = sc.nextInt();
//			System.out.println("enter j = ");
//			j = sc.nextInt();
//			k = i / j;
//			System.out.println(k);
//			System.exit(0);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//			catch (ArithmeticException e) {
//			System.out.println("denominator cannot be zero");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator cannot be string");
//			}
//		finally {
//			System.out.println("this will exeucutes everytime");
//		}
	}
}
