package com.gunapvkn.algorithms.recursion.easy;

public class Factorial {

	public static int factorial(int n) {
		if (n == 0) {
			return 1; // Base case: 0! = 1
		}
		return n * factorial(n - 1); // Recursive case
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
