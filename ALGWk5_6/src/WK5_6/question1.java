package WK5_6;
import java.util.Scanner;

public class question1 {
    public static double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180.0;
    }

    public static double taylor(double a, double h, int term) {
        // Returns 0 if we've reached the 6th term
        if (term > 5) {
            return 0;
        }

        double factorial = factorial(term);
        
        // Determine if term should be added or subtracted
        double sign = (term % 2 == 0) ? 1 : -1;

        // Calculate the current term's value
        double currentTerm = sign * derivative(a, term) * Math.pow(h, term) / factorial;

        // Call next term
        return currentTerm + taylor(a, h, term + 1);
    }

    // Calculate the derivatives of sin starting at 'a'
    public static double derivative(double a, int n) {
        switch (n % 4) {
            case 0: return Math.sin(a);
            case 1: return Math.cos(a);
            case 2: return -Math.sin(a);
            case 3: return -Math.cos(a);
            default: return 0;
        }
    }

    public static double factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Enter the angle (in degrees) for sin: ");
    	double degrees = scan.nextDouble();
    	
        double a = degreesToRadians(degrees); // Convert user input degrees to radians
        double h = degreesToRadians(-1); // Convert -1 degree to radians
        double result = taylor(a, h, 0); // Start with 0

        System.out.printf("sin(%.1f°) ≈ %.5f%n", degrees, result);
    }
}
