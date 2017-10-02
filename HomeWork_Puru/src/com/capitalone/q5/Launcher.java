package com.capitalone.q5;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputString;
		int inputIndex;

		System.out.println("Input a string:");
		inputString = s.nextLine();

		System.out.println("Now enter an index where the substring should end (inclusive):");
		inputIndex = s.nextInt();

		System.out.println("Your substring = " + Q5.getSubstring(inputString, inputIndex));
	}

}
