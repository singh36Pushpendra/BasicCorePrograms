package basic_java.day5.func;

import java.util.Scanner;

public class WindChill {

	static void printWindChill(double t, double v) {
		if (t <= 50 && v >= 3 && v <= 120) {
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Wind chill = " + w + " Fahrenheit");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		double temperature = scanner.nextDouble();
		System.out.println("Enter wind speed in miles per hour: ");
		double speed = scanner.nextDouble();
		
		printWindChill(temperature, speed);
		
	}
}
