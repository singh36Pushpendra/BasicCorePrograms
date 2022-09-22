package basic_java.day5.core;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two number: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		float quotient = (float)num1 / num2;
		int remainder = num1 % num2;
		
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
		
	}

}
