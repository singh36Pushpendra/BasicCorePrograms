package basic_java.day5.core;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num1, num2, num3;
		
		System.out.println("Enter first number: ");
		num1 = scanner.nextFloat();
		System.out.println("Enter second number: ");
		num2 = scanner.nextFloat();
		System.out.println("Enter third number: ");
		num3 = scanner.nextFloat();
		
		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " is the largest among three number!");
		else if (num2 > num3)
			System.out.println(num2 + " is the largest among three number!");
		else
			System.out.println(num3 + " is the largest among three number!");
	}
}
