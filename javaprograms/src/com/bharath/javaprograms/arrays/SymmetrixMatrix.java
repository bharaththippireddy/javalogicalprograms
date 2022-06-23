package com.bharath.javaprograms.arrays;

import java.util.Scanner;

public class SymmetrixMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = scanner.nextInt();
		System.out.println("Enter the number of columns");
		int n = scanner.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[n][m];

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

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[i][j] = a[j][i];
			}
		}

		System.out.println("Tranposed Matrix is");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		boolean flag = true;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] != b[i][j]) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			System.out.println("Symmetric");
		} else {
			System.out.println("Asymmetric");
		}

		scanner.close();
	}

}
