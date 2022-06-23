package com.bharath.javaprograms.arrays;

import java.util.Scanner;

public class MatrixRowSwap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = scanner.nextInt();
		System.out.println("Enter the number of columns");
		int n = scanner.nextInt();
		int a[][] = new int[m][n];

		System.out.println("Enter the matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Matrix is");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Enter the rows to swap");
		int swaprow1 = scanner.nextInt();
		int swaprow2 = scanner.nextInt();

		int temp = 0;

		for (int i = 0; i < n; i++) {
			temp = a[swaprow1 - 1][i];
			a[swaprow1 - 1][i] = a[swaprow2 - 1][i];
			a[swaprow2 - 1][i] = temp;
		}

		System.out.println("Matrix after swap");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}

}
