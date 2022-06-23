package com.bharath.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 100, 200, 10, 20, 30, 40, 70, 90 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		int index = recursiveBinarySearch(a, 20, 0, a.length - 1);

		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + index);
		}
	}

	private static int binarySearch(int[] a, int num, int low, int high) {
		while (low <= high) {
			int mid = (high + low) / 2;

			if (a[mid] == num) {
				return mid;
			}

			if (a[mid] < num) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

	private static int recursiveBinarySearch(int[] a, int num, int low, int high) {
		if (high >= low) {
			int mid = (high + low) / 2;

			if (a[mid] == num) {
				return mid;
			}

			if (a[mid] > num) {
				return recursiveBinarySearch(a, num, low, mid - 1);
			}

			return recursiveBinarySearch(a, num, mid + 1, high);
		}

		return -1;
	}

}
