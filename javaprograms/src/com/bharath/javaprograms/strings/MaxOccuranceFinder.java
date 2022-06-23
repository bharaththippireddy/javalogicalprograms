package com.bharath.javaprograms.strings;

import java.util.Scanner;

public class MaxOccuranceFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		int arr[] = new int[256];
		
		for(int i=0;i<s.length();i++) {
			arr[(int)s.charAt(i)]++;
		}
		
		int m = 0;
		
		for(int j=1;j<arr.length;j++) {
			if(arr[j]>arr[m]) {
				m = j;
			}
		}
		
		System.out.println("Max occuring character is: "+(char)m);
		scanner.close();
	
	}

}




