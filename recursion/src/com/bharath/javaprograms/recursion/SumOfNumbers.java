package com.bharath.javaprograms.recursion;

public class SumOfNumbers {

	public static int sum(int n) {
		if (n <= 1) {
			return n;
		} else {
			return n + sum(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(sum(4));
	}

}
