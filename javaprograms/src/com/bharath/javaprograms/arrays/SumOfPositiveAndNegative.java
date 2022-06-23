package com.bharath.javaprograms.arrays;

import java.util.Scanner;

public class SumOfPositiveAndNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements for the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		int nSum = 0, pSum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0 && a[i] != 0) {
				nSum += a[i];
			} else if (a[i] > 0 && a[i] != 0) {
				pSum += a[i];
			}

		}

		System.out.println("Sum of negative: " + nSum);
		System.out.println("Sum of positive: " + pSum);

		scanner.close();
	}

}
