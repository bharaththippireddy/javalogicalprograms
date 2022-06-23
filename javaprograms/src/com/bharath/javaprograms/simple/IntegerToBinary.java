package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] binaryNum = new int[10];
		int i = 0;
		while(num!=0) {
			binaryNum[i] = num % 2;
			num = num / 2;
			i++;
		}
		for(int j = i-1;j>=0;j--) {
			System.out.print(binaryNum[j]);
		}
		scanner.close();

	}

}
