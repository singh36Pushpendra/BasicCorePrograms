package basic_java.day5.func;

import java.util.Scanner;

public class Adds3ToZero {

	static void printDistinctTriplets(int[] a, int size) {
		int count = 0;
		for (int i = 0; i < size - 2; i++)
			for (int j = i + 1; j < size - 1; j++)
				for(int k = j + 1; k < size; k++)
				{
					if (a[i] + a[j] + a[k] == 0)
					{
						System.out.println("Distinct triplet adds to zero: " + a[i] + " " + a[j] + " " + a[k]);
						count++;
					}
				}
		System.out.println("Total no of distinct triplets: " + count);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		int[] integers = new int[size];
		
		System.out.println("Enter " + size + " integers in array: ");
		for (int i = 0; i < size; i++)
			integers[i] = scanner.nextInt();
		
		printDistinctTriplets(integers, size);
	}
}
