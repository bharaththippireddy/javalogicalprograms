package com.bharath.sorting.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = { 10, 1, 3, 4, 6, 8 };
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.enhancedSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public void enhancedSort(int[] numbers) {
		int i = 0;
		boolean swapped = true;

		while (swapped) {
			swapped = false;
			i++;
			for (int j = 0; j < numbers.length - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	public void sort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

}

























