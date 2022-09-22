package basic_java.day5.core;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two number: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("\nNumbers before swapping: ");
		System.out.println("First number = " + num1 + "\nSecond number = " + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("\nNumbers after swapping: ");
		System.out.println("First number = " + num1 + "\nSecond number = " + num2);
	}

}
