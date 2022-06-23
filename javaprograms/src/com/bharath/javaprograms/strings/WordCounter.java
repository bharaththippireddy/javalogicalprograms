package com.bharath.javaprograms.strings;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input.split(" ").length);
		
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}

		System.out.println(count+1);

	}

}
