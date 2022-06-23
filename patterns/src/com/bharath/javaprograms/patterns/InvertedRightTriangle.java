package com.bharath.javaprograms.patterns;

import java.util.Scanner;

public class InvertedRightTriangle {

	public static void main(String[] args) {
		System.out.println("How many numbers");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
