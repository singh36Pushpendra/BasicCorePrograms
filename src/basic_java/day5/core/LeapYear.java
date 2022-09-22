package basic_java.day5.core;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any year: ");
		int year = scanner.nextInt();
		
		String yearInStr = "" + year;
		
		if (yearInStr.length() == 4)
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				System.out.println(year + " is leap year!");
			else
				System.out.println(year + " is not leap year!");
		else
			System.out.println("Invalid year value: " + year);
	}
}
