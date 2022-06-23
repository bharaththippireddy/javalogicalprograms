package com.bharath.javaprograms.strings;

import java.util.Scanner;

public class StringEndChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = scanner.nextLine();
		System.out.println("Enter Second String");
		String s2 = scanner.nextLine();
		int count = 0;
		for (int i = s1.length() - 1, j = s2.length() - 1; j >= 0; i--, j--) {
			if (s1.charAt(i) == s2.charAt(j)) {
				count++;
			}
		}

		if (count == s2.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();

	}

}
