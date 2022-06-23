package com.bharath.sorting.selectionsort;

import java.util.Scanner;

public class MirrorTriangle {

	public static void main(String[] args) {
		System.out.println("How many numbers");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <=n - i) {
					System.out.print(" ");
				} else {
					System.out.print(j);

				}
			}
			System.out.println();
		}
		scanner.close();

	}

}
