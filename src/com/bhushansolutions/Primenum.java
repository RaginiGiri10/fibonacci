package com.bhushansolutions;

public class Primenum {

	public static void main(String[] args) {
		int num = 7, temp = 0;
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0)
				temp = temp + 1;
		}
		if (temp > 0) {
			System.out.println("it is not a prime number");
		} else {
			System.out.println("it is a prime number");
		}

	}

}
