package com.bharath.javaprograms.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenWordPrinterSecondWay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		
		String[] words = input.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i].length()%2==0) {
				System.out.println(words[i]);
			}
		}

		scanner.close();
	}

}
