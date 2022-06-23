package com.bharath.javaprograms.arrays;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements for the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}

		}

		System.out.println("Sum of even: " + sum);

		scanner.close();
	}

}
