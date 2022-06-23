package com.bharath.sorting.selectionsort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("How many numbers");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + " * " + j + " = " + i * j);
				System.out.println();
			}
			System.out.println();
		}
		System.out.println(new HashSet().toString());
		System.out.println(new ArrayList().toString());
		scanner.close();
	}

}
