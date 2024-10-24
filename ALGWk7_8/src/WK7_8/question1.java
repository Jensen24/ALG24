package WK7_8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question1 {
	public static void main (String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Lena");
		names.add("Nicholas");
		names.add("Aruns");
		names.add("Anthony");
		names.add("Daniel");
		names.add("Thomas");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String nameCheck = scan.nextLine();
		
		if (names.contains(nameCheck)) {
			System.out.println("The name " + nameCheck + " has been located in the list!");
		} else {
			System.out.println("The name: " + nameCheck + " is NOT in the list!");
		}
		scan.close();
	}

}