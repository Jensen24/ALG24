package WK1_2;

import java.util.Scanner;

public class Question1 {
	public static String even(int k) {
		if ((k & 1) == 0) {
			return "True";
		} else {
			return "False";
		}
		
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter an integer of your choice:");
	int userInput = scan.nextInt();
	
	String result = even(userInput);
	System.out.println("Is the integer Even? " + result);
}
}
