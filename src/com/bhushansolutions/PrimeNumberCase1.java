package com.bhushansolutions;

public class PrimeNumberCase1 {

	public static void main(String[] args) {
		
		int no = 8,temp=0;
		
		for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				temp= temp+1;
			}
		}

		if(temp>0) {
			System.out.println("NO is not prime");
		}else {
			System.out.println("No is prime");
		}
	}

}
