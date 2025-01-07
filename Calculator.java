package JavaProgramsDay2;
import java.util.Scanner;
public class Calculator {
	
	    public static void main(String args[]) {

	        double x, y;
	        Scanner obj = new Scanner(System.in);

	        // Input first number
	        System.out.print("Enter First Number: ");
	        x = obj.nextDouble();

	        // Input second number
	        System.out.print("Enter Second Number: ");
	        y = obj.nextDouble();

	        // Perform calculations
	        System.out.println("\nNow performing operations on the numbers:");

	        double add = x + y;
	        double sub = x - y;
	        double mul = x * y;

	        // Handle division by zero
	        if (y != 0) {
	            double divi = x / y;
	            System.out.println("Division of the Given Values: " + divi);
	        } else {
	            System.out.println("Division by zero is not allowed.");
	        }

	        // Display results
	        System.out.println("Addition of the Given Values: " + add);
	        System.out.println("Subtraction of the Given Values: " + sub);
	        System.out.println("Multiplication of the Given Values: " + mul);

	        obj.close(); // Close the scanner to free resources
	    }
	}
