package com.bharath.javaprograms.patterns;

import java.util.Scanner;

public class RightTrianglePattern3 {

	public static void main(String[] args) {
		System.out.println("How many numbers");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
