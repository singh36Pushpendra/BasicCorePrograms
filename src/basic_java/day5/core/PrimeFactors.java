package basic_java.day5.core;

import java.util.Scanner;

class PrimeFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number to find prime factors");
		int num = scanner.nextInt();
		boolean flag;

		System.out.print("Prime factors of " + num + " = ");
		for (int i = 2; i <= num; i++) {
			flag = true;
			if (i > num / 2 && i < num)
				continue;

			if (num % i == 0) {
				for (int j = 2; j <= i / 2; j++)
					if (i % j == 0) {
						flag = false;
						break;
					}

				if (flag)
					System.out.print(i + " ");
			}
		}
	}
}