package WK1_2;

import java.util.Scanner;

public class Question4 {

	public static int countVowels(String str) {
		int countVowels = 0;
		String lowerStr = str.toLowerCase();
		for (int i = 0 ; i < lowerStr.length(); i++) {
			char ch = lowerStr.charAt(i);
				if (lowerStr.charAt(i) == 'a' | lowerStr.charAt(i) == 'e' | lowerStr.charAt(i) == 'i' | lowerStr.charAt(i) == 'o' | lowerStr.charAt(i) == 'u') {
					countVowels ++;
				}
		}return countVowels;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string of letters: ");
		String userInput = scan.nextLine();
		int count = countVowels(userInput);
		System.out.println("Number of vowels: " + count);
	}
}
