package com.bharath.sorting.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = { 10, 1, 3, 4, 6, 8 };
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	private void sort(int[] numbers) {
		int min, temp, size = numbers.length;

		for (int i = 0; i < numbers.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (numbers[j] < numbers[min]) {
					min = j;
				}
			}
			temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;

		}
	}

}
