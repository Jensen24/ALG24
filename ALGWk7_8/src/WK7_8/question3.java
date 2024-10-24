package WK7_8;
import java.util.ArrayList;

// i did not know if I was suppose to add it to the previous program or not.
// I read this problem as just making the "error" message appear 

public class question3 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			myList.add("Element " + i);
		}
		try {
			String element = myList.get(10);
			System.out.println("Retrieved: " + element);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Error: Attempted to access an element beyond the scripted boundary.");
			System.err.println("Message: " + e.getMessage());
		}
		
	}
}
