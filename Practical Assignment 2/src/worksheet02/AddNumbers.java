// Has a package named worksheet02.
package worksheet02;
// Imported javax.swing.* to use JOptionPane class.
import javax.swing.*;

public class AddNumbers {
	public static void main(String args[]){
		// Prompt user for number using JOptionPane class.
		int num =Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 1-1000: "));      
		/* Used while loop so user must enter the numbers between 1 to 1000.They must input new number if the number is
		more than 1000 or less than 0 */
		while(num > 1000 || num < 0 ) {
			num =Integer.parseInt(JOptionPane.showInputDialog("This is not a number between 1-1000.\nPlease enter a number between 1-1000:"));
		}
		// Prints the number that the user has entered that is between 1 to 1000.
		System.out.println("Thank you for picking the number: " + num);
		// Created an integer Sum and digits.
		int sum = 0;
		int digit = 0;
		/* Created a while loop to find and add each digits of the users number.
		digit variable finds the reminder of the number,sum variable adds the digits 
		and num variable is used to divide the number to the next digit (dividing by 10).*/
		while(num > 0){
			digit = num % 10;
	        sum = sum + digit;
	        num = num / 10;
	    }
		// Prints out the sum of the number.
	    System.out.println("The sum of all digits is: "+ sum);
    }
}
