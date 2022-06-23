package com.bharath.javaprograms.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenWordPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(input);
		
		while(tokenizer.hasMoreTokens()) {
			String eachToken = tokenizer.nextToken();
			if(eachToken.length()%2==0) {
				System.out.println(eachToken);
			}
		}

		scanner.close();
	}

}
