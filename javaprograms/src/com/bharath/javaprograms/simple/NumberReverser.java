package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class NumberReverser {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(),result=0;
		
		while(num!=0) {
			digit = num % 10;
			result = result*10+digit;
			num = num / 10;
		}
		System.out.println(result);
		scanner.close();
	}

}
