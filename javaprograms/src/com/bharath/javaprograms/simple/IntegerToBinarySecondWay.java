package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class IntegerToBinarySecondWay {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(Integer.toBinaryString(num));
		scanner.close();

	}

}
