package com.oop.functionToFunction;

public class FunctionToFunction {
	
	public static int div_2(int a) {
		if (a % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void div_6(int b) {
		if (div_2(b) == 1 && b % 3 == 0) {
			System.out.print("Ya, Jumlah nya habis di bagi 6.\n");
		} else {
			System.out.print("Tidakk, Jumlah nya tidak habis di bagi 6.\n");
		}
	}

	public static void main(String[] args) {
		div_6(12);
		div_6(25);
	}
}
