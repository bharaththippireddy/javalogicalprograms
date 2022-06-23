package com.bharath.javaprograms.arrays;

import java.util.Scanner;

public class SumOfMatrices {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = scanner.nextInt();
		System.out.println("Enter the number of columns");
		int n = scanner.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int sum[][] = new int[m][n];

		System.out.println("Enter matrix1");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter matrix2");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("Sum is");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}

}
