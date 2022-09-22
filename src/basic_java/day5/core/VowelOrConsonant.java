package basic_java.day5.core;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any alphabet symbol: ");
		String symbol = scanner.next();
		
		char alpha = symbol.toLowerCase().charAt(0);
		int asciiVal = (int) alpha;
		
		if (asciiVal >= 97 && asciiVal <= 122)
			switch (alpha) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(symbol.charAt(0) + " is a vowel!");
				break;
			default:
				System.out.println(symbol.charAt(0) + " is a consonant!");
			}
		else
			System.out.println("Invalid input: '" + symbol + "' Please enter only alphabet symbol!");
	}
}
