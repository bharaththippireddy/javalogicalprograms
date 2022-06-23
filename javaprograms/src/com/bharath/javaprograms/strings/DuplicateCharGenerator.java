package com.bharath.javaprograms.strings;

import java.util.Scanner;

public class DuplicateCharGenerator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		
		StringBuffer output = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			output.append(input.charAt(i));
			output.append(input.charAt(i));
		}

		System.out.println(output);

		scanner.close();
	}

}
