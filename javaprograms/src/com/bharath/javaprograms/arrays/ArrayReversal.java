package com.bharath.javaprograms.arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int reversed[] = new int[5];
		for (int i = 0, j = a.length; i < a.length; i++, j--) {
			reversed[j - 1] = a[i];
		}

		for (int i = 0; i < reversed.length; i++) {
			System.out.print(reversed[i]+" ");

		}
	}

}
