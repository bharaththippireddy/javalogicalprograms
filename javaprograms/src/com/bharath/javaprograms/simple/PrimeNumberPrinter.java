package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class PrimeNumberPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a start:");
		int start = scanner.nextInt();
		System.out.println("Enter a end:");
		int end = scanner.nextInt();
		
		for(int i = start;i<=end;i++) {
			int count = 0;
			if(i>1) {
				for(int j=2;j<i/2;j++) {
					if(i%j==0) {
						count++;
						break;
					}
				}
				if(count==0) {
					System.out.println(i);
				}
			}
		}
		
		scanner.close();
	
	}

}
