package WK7_8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class question2 {
	public static void main (String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter a number that is greater than or equal to 2: ");
		int n = scan.nextInt();
		
		if (n < 2) {
			System.out.println("Please enter a number greater than or equal to 2: ");
			return;
		}
		List<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		int repeatedNumber = random.nextInt(n) + 1; // Chooses a number to repeat
		
		for (int i = 1; i <= n; i++) {
			numbers.add(i);
			if (i == repeatedNumber) {
				numbers.add(repeatedNumber);
			}
		}
		java.util.Collections.shuffle(numbers); // Randomizes the order
		
		int foundRepeatedNumber = findNumber(numbers);
		
		if (foundRepeatedNumber != -1) {
			System.out.println("The repeated number is: " + foundRepeatedNumber);
		} else {
			System.out.println("No repeated number found.");
		}
		scan.close();
	}
	private static int findNumber(List<Integer> numbers) {
		HashMap<Integer, Integer> countMap = new HashMap<>();
		
		for (int number : numbers) {
			countMap.put(number, countMap.getOrDefault(number, 0) + 1);
			if (countMap.get(number) > 1) {
				return number; // Repeats the repeated number
			}
		}
		return -1; // Signals that no repeated number was located
	}
}
