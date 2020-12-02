package com.bhushansolutions;

import java.util.Scanner;

public class Primeuser1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("the number is not prime");
		} else {
			System.out.println("the number is prime");
		}
	}

}
