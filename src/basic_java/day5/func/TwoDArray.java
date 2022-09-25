package basic_java.day5.func;

import java.util.Scanner;

public class TwoDArray {

	static void readPrintArray(char ch, int rows, int cols) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter elements in ");
		switch(ch) {
		case 'b':
			boolean[][] arrBools = new boolean[rows][cols];
			System.out.println("boolean type array: ");
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < cols; j++)
					arrBools[i][j] = scanner.nextBoolean();
			System.out.println("Element in boolean array:");
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < cols; j++)
					System.out.println("arr[" + i + "][" + j + "] = " + arrBools[i][j]);
			
			break;
		case 'i':
			int[][] arrInts = new int[rows][cols];
			System.out.println("int type array: ");
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < cols; j++)
					arrInts[i][j] = scanner.nextInt();
			System.out.println("Elements in int array:");
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < cols; j++)
					System.out.println("arr[" + i + "][" + j + "] = " + arrInts[i][j]);
			
			break;
		case 'd':
			double[][] arrDoubs = new double[rows][cols];
			System.out.println("double type array: ");
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < cols; j++)
					arrDoubs[i][j] = scanner.nextDouble();
			System.out.println("Elements in double array:");
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < cols; j++)
					System.out.println("arr[" + i + "][" + j + "] = " + arrDoubs[i][j]);
			
			break;
		default:
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 'b' for boolean array: ");
		System.out.println("Enter 'i' for integer array: ");
		System.out.println("Enter 'd' for double array: ");
		System.out.print("Enter your choice for array creation: ");
		char arrType = scanner.next().charAt(0);
		
		System.out.println("Enter total no of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter total no of columns: ");
		int cols = scanner.nextInt();
		readPrintArray(arrType, rows, cols);
	}
}
