package com.bharath.javaprograms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringOrderChecker {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
	
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray).equals(input));
		
		scanner.close();

	}

}
