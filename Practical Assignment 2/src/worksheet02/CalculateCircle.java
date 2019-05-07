// Has a package named worksheet02.
package worksheet02;

public class CalculateCircle {
	public static void main(String args[]){
		// Created a double named radius.
		double radius = 5;
		// Created a constant double named pi which cannot be changed.
		final double pi = 3.14;
		// Created a double circleArea variable which has the value of the Area of the circle(formula).
		double circleArea = (pi)*(radius)*(radius);
		// Created a double circumference variable which has the value of the circumference of the circle(formula).
		double circumference = 2*(pi)*(radius);
		// Prints of the circles radius,area and circumference.
		System.out.println("The circle has a radius of " + radius +
				   "\nIts area is " + circleArea + 
				   "\nIts circumference is " + circumference);
	}
}
