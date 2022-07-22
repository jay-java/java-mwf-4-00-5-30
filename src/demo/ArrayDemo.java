package demo;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for(int index=0;index<arr.length;index++) {
			System.out.println("value at arr["+index+"] is "+arr[index]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.print("enter element at index["+i+"] : ");
			a[i] = sc.nextInt();
			sum = sum+a[i];
		}
		System.out.println("sum = "+sum);
		System.out.println("enter  num = ");
		int num = sc.nextInt();
		int counter = 0;
		for(int i=0;i<a.length;i++) {
			if(num == a[i]) {
				counter++;//1
			}
		}
		if(counter == 1) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}
}
