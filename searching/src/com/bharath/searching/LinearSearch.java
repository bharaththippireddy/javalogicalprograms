package com.bharath.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 70, 90 };
		int index = linearSearch(a, 70);

		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + index);
		}
	}

	private static int linearSearch(int[] a, int num) {

		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				return i;
			}
		}

		return -1;

	}

}
