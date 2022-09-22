 package basic_java.day5.core;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number from 0-30 only: ");
		int num = scan.nextInt();
		int ans;
		
		if (num >= 0 && num < 31) {
			System.out.println("2^0 = 1");
			
			for (int i = 1; i <= num; i++) {
				ans = 1;
				for (int j = 1; j <= i; j++)
					ans *= 2;
				System.out.println("2^" + i + " = " + ans);
			}
		}
		else
			System.out.println("Can't proceed: Number not in specified range!");
	}
}
