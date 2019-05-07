// Has a package named worksheet02.
package worksheet02;
// Imported java.util.Scanner to use Scanner Class.
import java.util.Scanner; 

public class CalculateCircleUserInput {
	public static void main(String args[]){
		// Asked the user to enter a number for radius
		System.out.println("Please enter a number for radius: ");
		Scanner input = new Scanner(System.in);
		// Created a double variable called radius that takes in the number from the user.
		double radius = input.nextInt();
		// Closes the Scanner called input.
		input.close();
		// Created a constant double named pi which cannot be changed.
		final double pi = 3.14;
		// Created a double circleArea variable which has the value of the Area of the circle(formula)
		double circleArea = (pi)*(radius)*(radius);
		// Created a double circumference variable which has the value of the circumference of the circle(formula).
		double circumference = 2*(pi)*(radius);
		// Prints of the circles radius,area and circumference based on users input.
		System.out.println("You have defined the circle's radius " + radius +
						   "\nThe circle has a radius of " + radius +
				   		   "\nIts area is " + circleArea + 
				           "\nIts circumference is " + circumference);
	}
}
