// 1.Set up of Scanner object (imported java.util.*.)
import java.util.*; 

// Java class called Worksheet01
public class Worksheet01 {

	public static void main(String[] args) {
		
		System.out.println("--------Worksheet 01--------" + "\n****************************\n");
		
		// 2.Asked the user to enter a number
		System.out.println("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		// 3. integer variable called num1 that takes in the number from the user.
		int num1 = input.nextInt();
		/* 4.Check whether the number is odd or even using if statement and outputs the answer.
		"The number is even" or "The number is odd" */ 
		if(num1 % 2 == 0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
		
		// 5.Print out a line of asterisks followed by a blank line before and after.
		System.out.println("\n****************************\n");
		
		// 6. Ask the user to enter another number.
		System.out.println("Please enter another number: ");
		/* 7.Integer variable called num2 that takes another number from the user. 
		Still using Scanner input from question 2 for integer num2 */
		int num2 = input.nextInt();
		/* 8. Minus number 2 from number 1. Check whether the answer is negative, positive or zero.It then outputs the
		answer “The number answer is positive”,”The number answer is negative” or "The number is zero".*/
		int answer = num1 - num2;
		if(num1 - num2 > 0 ) {
			System.out.println("The number " + answer +" is a positive.");
		}else if(num1 - num2 < 0 ) {
			System.out.println("The number " + answer +" is a negative.");
		}else {
			System.out.println("The number is zero.");
		}
		//close Scanner named input
		input.close(); 
		
		// 9.Print out a line of asterisks followed by a blank line before and after.
		System.out.println("\n****************************\n");
		
		/* 10.Created a String array with 5 names. Use a For loop to print out 
		all the names in the array (each on its own line).*/
		ArrayList<String> fiveNames = new ArrayList<String>();

		fiveNames.add("1.Adam");
		fiveNames.add("2.Bobby");
		fiveNames.add("3.Clare");
		fiveNames.add("4.Derek");
		fiveNames.add("5.Eric");
		 
		for(String name : fiveNames){
		 	System.out.println(name);
		 }
		
		// 11.Print out a line of asterisks followed by a blank line before and after.
		System.out.println("\n****************************\n");
		
		
		/* 12. Created an array of 10 numbers. Loop through them and output the number and whether it is
		odd or even or zero.*/
		ArrayList<Integer> tenNumbers = new ArrayList<Integer>();
		
		tenNumbers.add(384930);
		tenNumbers.add(567471);
		tenNumbers.add(576474);
		tenNumbers.add(472357);
		tenNumbers.add(547764);
		tenNumbers.add(646569);
		tenNumbers.add(636564);
		tenNumbers.add(980439);
		tenNumbers.add(378586);
		tenNumbers.add(324807);
		
		for(Integer number : tenNumbers) {
			
			if(number % 2 == 0) {
				System.out.println(number + " is even");
			}else {
				System.out.println(number + " is odd");
			}
		}
		
		// 13.Print out a line of asterisks followed by a blank line before and after.
		System.out.println("\n****************************\n");	
	}
}
