package basic_java.day5.core;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// Printing the nth harmonic number.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();

		float nthHarmonic = 0;
		if (num != 0) {
			for (int i = 1; i <= num; i++)
				nthHarmonic += 1f/i;
			System.out.println("Harmonic number present at position " + num + " = " + nthHarmonic);
		}
	}
}
