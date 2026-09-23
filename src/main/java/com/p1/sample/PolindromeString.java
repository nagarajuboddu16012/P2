package com.p1.sample;

import java.util.Scanner;

public class PolindromeString {

	//addeddummy commit for PR creation
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/// madam
		// eyeball

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string value");
		String input = scanner.nextLine();
		if (isPolindrome(input)) {
			System.out.println("the given String is polindrome");
		} else {
			System.out.println("the given String is not polindrome");
		}
		scanner.close();
	}

	public static boolean isPolindrome(String str) {

		String normalized = normalized(str);

		String reversed = reversedString(normalized);

		return normalized.equals(reversed);

	}

	private static String normalized(String str) {
		// TODO Auto-generated method stub
		StringBuilder normalized = new StringBuilder();
		for (char c : str.toCharArray()) {
			normalized.append(Character.toLowerCase(c));
		}

		return normalized.toString();
	}

	private static String reversedString(String str) {
		StringBuilder reversed = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}

		return reversed.toString();
	}

}
