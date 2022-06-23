package com.bharath.javaprograms.arrays;

import java.util.Scanner;

public class LastMElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements for the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println("Enter the number of last elements to display");
		int m = scanner.nextInt();
		if (m < n) {
			for (int i = n - m; i < n; i++) {
				System.out.println(a[i]);
			}
		} else {
			System.out.println("Enter a valid input");
		}

		scanner.close();
	}

}
