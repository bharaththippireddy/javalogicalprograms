package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class NivenNumberChecker {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(num%sum(num)==0?"Niven Number":"Not Niven");
		
		scanner.close();
	}

	private static int sum(int num) {
		int digit,sum = 0;
		while(num!=0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}

}
