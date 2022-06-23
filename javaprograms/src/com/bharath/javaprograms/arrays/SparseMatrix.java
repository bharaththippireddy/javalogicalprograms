package com.bharath.javaprograms.arrays;

import java.util.Scanner;

public class SparseMatrix {

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

		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 0) {
					count++;
				}
			}
		}

		if (count > (m * n) / 2) {
			System.out.println("Sparse Matrix");
		} else {
			System.out.println("Not a Sparse Matrix");
		}

		scanner.close();
	}

}
