package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();
		
		while(num!=0) {
			digit = num % 10;
			System.out.print(digit+" ");
			num = num / 10;
		}
		
		scanner.close();
	}

}
