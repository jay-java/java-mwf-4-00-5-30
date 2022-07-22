package demo;

import java.util.Scanner;

/*1.simple if
 * 2. if else
 * 3.nested if
 * 4.else if ladder
 * 5.switch case */
public class conditionalStaetment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a = ");
		int a = sc.nextInt();
		System.out.print("enter b = ");
		int b = sc.nextInt();
		//1.
		if(a>b) {
			System.out.println("a is greater than b");
		}
		
		//2.
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		//3.
		System.out.print("enter age");
		int age = sc.nextInt();
		if(age>18) {
			if(age<60) {
				System.out.println("eligigble for donate");
			}
			else {
				System.out.println("age is greater 18 but not less than 60");
			}
		}
		else {
			System.out.println("age is less than 18");
		}
		
		//4.
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		if(marks<35) {
			System.out.println("fail");
		}
		else if(marks>=35 && marks<=50) {
			System.out.println("D grade");
		}
		else if(marks>=51 && marks<=70) {
			System.out.println("C grade");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("B grade");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("A grade");
		}
		else if(marks>=91 && marks<=100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("invalid input");
		}
		
		//5.switch
		System.out.println("1. for English 2.For Hindi 3. For Gujarati"
				+ "enter your option : ");
		int lang = sc.nextInt();
		switch (lang) {
		case 1: 
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected Hindi");
			break;
		case 3:
			System.out.println("You selected Gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
