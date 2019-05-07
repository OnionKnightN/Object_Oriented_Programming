// Has a package named worksheet02.
package worksheet02;
// Imported java.util.Scanner to use Scanner Class.
import java.util.Scanner;

public class MinutesToDays {
	public static void main(String args[]){
		// Asked the user to enter a number for minutes.
		System.out.println("Please enter number of minutes:");
		// Created a Scanner Class new input.
		Scanner input = new Scanner(System.in);
		// Takes the input number from the user.
		int min = input.nextInt();
		// Closes the Scanner named input.
		input.close();
		// Made an integer variable named minutesInYear that provides minutes in a year.
		int minutesInYear = 365*24*60;
		// Made an integer variable named minutesInDay that provides minutes in a day.
		int minutesInDay = 24 * 60;
		// Made an integer variable named years that converts the users input into years.
		int years = min/minutesInYear;
		// Made an integer variable named minutesRemainder that provides the remainder of minutes in a year from the users input.
		int minutesRemainder = min%minutesInYear;
		// Made an integer variable named day that provides the remainder of minutes in a day.
		int days = minutesRemainder/minutesInDay;
		// Prints out the number of years and days based minutes of the users input.
		System.out.println("The number of years and days in these minutes are:"+ "\nYears: " + years +"\nDays: "+ days);
	}
	
}

