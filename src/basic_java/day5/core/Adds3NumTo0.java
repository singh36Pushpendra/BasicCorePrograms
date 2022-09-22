package basic_java.day5.core;

public class Adds3NumTo0 {

	public static void main(String[] args) {
		int[] integers = {2, -7, 3, -5, 6, 1, -2, 0};
		
		if (integers[0] + integers[1] + integers[2] == 0)
			System.out.println("Addition of " + integers[0] + " " + integers[1] + " " + integers[2] + " = 0");
		else
			System.out.println("Three integers: " + integers[0] + " " + integers[1] + " " + integers[2]);
		
		int size = integers.length;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size; j++) {
				for (int k = 2; k < size; k++) {
					
				}
			}
		}
	}
}
