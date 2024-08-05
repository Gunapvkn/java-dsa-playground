package com.gunapvkn.algorithms.recursion.easy;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {

	private static Map<Integer, Integer> cache = new HashMap<>();

	public static void main(String[] args) {
		int n = 10;
		System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;  // Base case: fibonacci(0) = 0, fibonacci(1) = 1
		}
		// Check if the result is already in the cache
		if (cache.containsKey(n)) {
			return cache.get(n);
		}
		  // Compute the result and store it in the cache
		int result = fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
		cache.put(n, result);
		return result;
	}
}
