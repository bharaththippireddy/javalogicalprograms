package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class PalindromCheckerSecondWay {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		StringBuffer sb = new StringBuffer(num);
		String reversedNumber = sb.reverse().toString();
		System.out.println(num.equals(reversedNumber)?"Palindrome":"Not a Palindrome");
		scanner.close();
	}

}
