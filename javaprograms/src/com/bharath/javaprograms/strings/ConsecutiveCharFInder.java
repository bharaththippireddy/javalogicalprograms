package com.bharath.javaprograms.strings;

import java.util.Scanner;

public class ConsecutiveCharFInder {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		boolean found = false;
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				found = true;
				break;
			}
		}

		System.out.println(found);
	}

}
