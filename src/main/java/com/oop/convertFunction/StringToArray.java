package com.oop.convertFunction;

public class StringToArray {

	public static void main(String[] args) {
		String str = "Contoh Java String to Array";
		String strArray[] = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
