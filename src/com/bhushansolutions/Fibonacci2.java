package com.bhushansolutions;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number upto which you want to print");
		int num=scanner.nextInt();
		for(int i=0;i<=num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
