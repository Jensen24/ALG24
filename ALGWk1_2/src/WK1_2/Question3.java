package WK1_2;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Question3 {
	public static boolean distinct(String[] numbers) {
		Set<Integer> numberSet = new HashSet<>();
		for (String numStr : numbers) {
			try {
				int number = Integer.parseInt(numStr);
				if (!numberSet.add(number)) {
					return false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid! Please try again: " + numStr);
				return false;
			}
		}
		return true;
	}
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string of numbers (Include spaces): ");
	String input = scan.nextLine();
	String[] numbers = input.split("\\s+");
	boolean result = distinct(numbers);
	System.out.println("Are all numbers Distinct? " + result);
}
}
