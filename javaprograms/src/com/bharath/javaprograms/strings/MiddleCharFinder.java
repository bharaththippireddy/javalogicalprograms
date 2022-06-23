package com.bharath.javaprograms.strings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MiddleCharFinder {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(1);
		list.add(1000);
		list.add(10);
		list.add(10000);
		list.add(10);

		NavigableSet<Integer> n = new TreeSet(list);
		System.out.println(n.tailSet(10, false));
		System.out.println(n.tailSet(10));
		System.out.println(n.higher(10));

		int a = n.pollFirst();
		System.out.println(n.size());

		int point = Collections.binarySearch(list, 25, Collections.reverseOrder());
		System.out.println(point);

		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int length = input.length();

		if (length % 2 == 0) {
			System.out.println(input.substring(length / 2 - 1, length / 2 + 1));
		} else {
			System.out.println(input.substring(length / 2, length / 2 + 1));
		}
		scanner.close();
	}

}
