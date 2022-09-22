package basic_java.day5.core;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of times to flip a coin:");
		int number = scanner.nextInt();
		float toss;
		int tailCount = 0, headCount = 0;
		Random random = new Random();
		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				toss = random.nextFloat();
				if (toss < 0.5)
					tailCount++;
				else
					headCount++;
			}
			
			System.out.println("Total number of times coin flipped: " + number);
			System.out.println("Percentage of head = " + (float)headCount / number * 100 + "%");
			System.out.println("Percentage of tail = " + (float)tailCount / number * 100 + "%");
		}
		else
			System.out.println("Invalid value: Can't flip a coin '" + number + "' times!");
	}
}
