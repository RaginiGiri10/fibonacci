package com.bhushansolutions;

import java.util.Scanner;

public class Primeuser {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("the no is not prime ");
		} else {
			System.out.println("the no is prime");
		}

	}

}
