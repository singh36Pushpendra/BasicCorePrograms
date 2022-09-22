package basic_java.day5.func;

import java.util.Scanner;

public class Quadratic {

	static void findRoots(int a, int b, int c) {
		int delta = b * b - 4 * a * c;
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("First root = " + root1);
		System.out.println("Second root = " + root2);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coefficients for quadratic equation 'a*x*x + b*x + c':");
		System.out.println("Enter a value:");
		int a = scanner.nextInt();
		System.out.println("Enter b value:");
		int b = scanner.nextInt();
		System.out.println("Enter c value:");
		int c = scanner.nextInt();
		
		System.out.println("Quadratic equation: " + a + "x^2 + (" + b + ")x + (" + c + ")");
		findRoots(a, b, c);
	}
}
