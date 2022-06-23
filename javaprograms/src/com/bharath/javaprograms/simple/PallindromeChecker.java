package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class PallindromeChecker {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), result = 0;
		int temp = num;

		while (num != 0) {
			digit = num % 10;
			result = result * 10 + digit;
			num = num / 10;
		}
		if (result == temp) {
			System.out.println("Is a Palindrom");
		} else {
			System.out.println("Is not a Palindrome");
		}

		scanner.close();
	}

}
