package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class DuckNumberChecker {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();
		boolean isDuckNumber = false;
		
		while(num!=0) {
			digit = num % 10;
			if(digit==0) {
				isDuckNumber = true;
				break;
			}
			num = num / 10;
		}
		if(isDuckNumber) {
			System.out.println("Number is a duck number");
		}else {
			System.out.println("Not a duck number");
		}
		
		scanner.close();
	}

}
