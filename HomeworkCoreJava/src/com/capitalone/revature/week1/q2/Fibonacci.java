// Print first 25 Fibonacci numbers starting from 0

package com.capitalone.revature.week1.q2;

public class Fibonacci {
	public static void main(String[] args) {

		int fibCurrent = 0; // First Fibonacci Number
		int fibNext = 1; // Second Fibonacci Number
		int fibCalculated = 0; // Temporary Variable to calculate the next
								// Fibonacci Number

		// Print the first two Fibonacci numbers
		System.out.println(fibNext + ": " + fibCurrent);
		System.out.println(fibNext + 1 + ": " + fibNext);

		// Calculate and print next Fibonacci Number
		for (int f = 3; f < 26; f++) {

			fibCalculated = fibCurrent + fibNext; // Calculate next Fibonacci
													// Number

			System.out.println(f + ": " + fibCalculated);

			fibCurrent = fibNext; // Swap the variable values
			fibNext = fibCalculated; // Save the calculated Fibonacci Number

		}
	}
}
