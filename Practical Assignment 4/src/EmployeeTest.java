// imported java.sql.Date and java.util.Scanner to use Date and Scanner Class.
import java.sql.Date;
import java.util.Scanner;

//Created a class called EmployeeTesT
public class EmployeeTest {
	public static void main(String[] args) {
	
		// Created the first object called secretAgent0 using the default constructor with 0 parameters
		Employee secretAgent0 = new Employee();
		// Created three more objects called secretAgent1,secretAgent2 and secretAgent3 using the constructor with 5 parameters
		Employee secretAgent1 = new Employee("James","Bond","male",Date.valueOf("1980-07-07"),Date.valueOf("2018-12-01"));
		Employee secretAgent2 = new Employee("Austin","Powers","male",Date.valueOf("1990-07-07"),Date.valueOf("2018-11-01"));
		Employee secretAgent3 = new Employee("Johnny","English","male",Date.valueOf("2000-07-07"),Date.valueOf("2018-10-01"));
		
		// Printed out the details of all employees using the toString() method.
		System.out.println("Details of Secret Agent: " + secretAgent0.toString());
		System.out.println("Details of Secret Agent: " + secretAgent1.toString());
		System.out.println("Details of Secret Agent: " + secretAgent2.toString());
		System.out.println("Details of Secret Agent: " + secretAgent3.toString());
		
		// Created a Scanner object called sc.
		Scanner sc = new Scanner(System.in);
		// Print out how many times you will like to loop.
		System.out.println("Please enter the number of specialAgent you would like to create");
		// Allows you to assign a int value into numberOfEmployees using the scanner object.
		int numberOfEmployees = sc.nextInt();
		// Created a Employee object array name employeeArray that carries the value of numberOfEmployees.
		Employee[] employeeArray = new Employee[numberOfEmployees];
		// Assigning the int value of i to 0.
		int i=0;
		// Using a while loop where the contion states if the value i is less then 
		// the value numberOfEmployees continue executing loop.
		while(i<numberOfEmployees) {
			// Create new object called currentAgent using the default constructor with 0 parameters.
			Employee currentAgent = new Employee();
			// Prints details of Secret Agent and value of i + 4.
			System.out.println("*** Details for new Secret Agent "+(i+4)+"*******");
			// Ask the user to enter first name.
			System.out.println("Please enter the Secret Agent first name");
			// Allows you to assign a String value into f_name using the scanner object.
			String f_name = sc.next();
			// Using the Setter Method object to set f_name into currentAgent object.
			currentAgent.setFirstName(f_name);
			// Ask the user to enter last name.
			System.out.println("Please enter the Secret Agent last name");
			// Allows you to assign a String value into l_name using the scanner object.
			String l_name = sc.next();
			// Using the Setter Method object to set l_name into currentAgent object.
			currentAgent.setLast_name(l_name);
			// Ask the user to enter date of birth.
			System.out.println("Please enter the Secret Agent date of birth in the format yyyy-MM-dd");
			// Allows you to assign a String value into temp using the scanner object.
			String temp = sc.next();
			// Changing the string temp into datatype Date asigning it to the name dob.
			Date dob = Date.valueOf(temp);
			// Using the Setter Method object to set dob into currentAgent object.
			currentAgent.setBirthDate(dob);
			// Ask the user to enter gender.
			System.out.println("Please enter the Secret Agent gender");
			// Allows you to assign a String value into gender using the scanner object.
			String gender = sc.next();
			// Using the Setter Method object to set gender into currentAgent object.
			currentAgent.setGender(gender);
			// Ask the user to enter hire date.
			System.out.println("Please enter the Secret Agent hire date in the format yyyy-MM-dd");
			// Allows you to assign a String value into temp2 using the scanner object.
			String temp2 = sc.next();
			// Changing the string temp2 into datatype Date asigning it to the name hire_date.
			Date hire_date = Date.valueOf(temp2); 
			// Using the Setter Method object to set hire_date into currentAgent object.
			currentAgent.setHireDate(hire_date);
			// Created an an object array with a value of i to the current Agent you created.
			employeeArray[i]=currentAgent; 
			// increment i to plus 1.
			i++;
		}
		// Closing the Scanner class after the while loop has been finished. 
		sc.close();
		
		// Prints out text to show new employeeArray you have created.
		System.out.println("employeeArray");
		// Using the for loop to print out all the employeeArray you have created.
		// The for loop will stop executing once j is less the the length of employeeArray.
		for(int j =0; j< employeeArray.length; j++) {
			System.out.println(employeeArray[j]);
		}
	}
}

