package basic_java.day5.func;

import java.util.Scanner;

public class Distance {

	static double findDistance(int x, int y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x and y co-ordinate value: ");
		int xVal = scanner.nextInt();
		int yVal = scanner.nextInt();
		
		double distance = findDistance(xVal, yVal); 
		System.out.println("Euclidean distance from point (" + xVal + ", " + yVal + ") to origin = " + distance);
	}
}
