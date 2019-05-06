package com.oop.convertFunction;

public class StringToInteger {
	public static void main(String args[]) {
		String nilaiString = "123";
		int nilaiINT = 100;

		int nilaiConvert = Integer.parseInt(nilaiString);
		int sum = nilaiConvert + nilaiINT;
		System.out.println("Result is: " + sum);
	}
}
