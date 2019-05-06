package com.oop.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayFunction {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 3, 5, 7, 9 };

		List<Integer> myList = new ArrayList<Integer>();

		for (int x : a) {
			if (x == 1) {
				System.out.println(x);
				myList.add(x);
			}
		}

		for (int y : b) {
			if (y == 3) {
				System.out.println(y);
				myList.add(y);
			}
		}

		for (int h : myList) {
			System.out.print(h + ", ");
		}

	}
}
