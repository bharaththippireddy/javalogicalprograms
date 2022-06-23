package com.bharath.javaprograms.arrays;

import java.util.Scanner;

public class MaatrixColumnSwap {

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

		System.out.println("Enter the columns to swap");
		int swapcolumn1 = scanner.nextInt();
		int swapcolumn2 = scanner.nextInt();

		int temp = 0;

		for (int i = 0; i < m; i++) {
			temp = a[i][swapcolumn1 - 1];
			a[i][swapcolumn1 - 1] = a[i][swapcolumn2 - 1];
			a[i][swapcolumn2 - 1] = temp;
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