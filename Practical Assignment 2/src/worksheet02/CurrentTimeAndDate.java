// Has a package named worksheet02.
package worksheet02;
// Imported java.util.* to use SimpleDateFormat Class)
import java.util.*;
import java.text.SimpleDateFormat;

public class CurrentTimeAndDate {
	public static void main(String args[]){
		// Used currentTimeMillis Method to get current time in milliseconds.
		long milliSeconds = System.currentTimeMillis();
		// Used SimpleDateFormat to format the output of time and date.
		SimpleDateFormat dateformat = new SimpleDateFormat("HH:mma dd/MM/yyyy ");   
		// Created Date Class today using the milliseconds from currentTimeMillis Method.
		Date today = new Date(milliSeconds);
		// Prints the time and date using the methods and classes above.
		System.out.println(dateformat.format(today));
	}
}
