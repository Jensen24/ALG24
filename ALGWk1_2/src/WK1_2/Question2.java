package WK1_2;

import java.util.Scanner;

public class Question2 {
	public static int sumTill(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum =+ i * i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a positive integer of your choice: ");
		int userInput = scan.nextInt();
		
		if (userInput > 0) {
			System.out.println("The sum of the squares smaller than " + userInput + ": " + sumTill(userInput));
		}else {
			System.out.println("Enter a positive integer of your choice: ");
		}
	}
}
