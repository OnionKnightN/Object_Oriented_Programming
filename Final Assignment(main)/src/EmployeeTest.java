// imported java.sql.Date and java.util.Scanner to use Date and Scanner Class.
import java.sql.Date;
import java.util.Scanner;

//Created a class called EmployeeTesT
public class EmployeeTest {
	public static void main(String[] args) {
	
		// Created the first object called employee0 using the default constructor with 0 parameters
		Employee employee0 = new Employee();
		// Created three more objects called employee1,employee2 and employee3 using the constructor with 7 parameters
		Employee employee1 = new Employee(1, Date.valueOf("1980-07-07"), "James","Bond","M", Date.valueOf("2018-12-01"), 10000);
		Employee employee2 = new Employee(2, Date.valueOf("1990-07-07"), "Austin","Powers","M", Date.valueOf("2018-11-01"),20000);
		Employee employee3 = new Employee(3, Date.valueOf("2000-07-07"), "Johnny","English","M", Date.valueOf("2018-10-01"),30000);
		
		// Printed out the details of all employees using the toString() method.
		System.out.println("Details of Employee: " + employee0.toString());
		System.out.println("Details of Employee: " + employee1.toString());
		System.out.println("Details of Employee: " + employee2.toString());
		System.out.println("Details of Employee: " + employee3.toString());
		
		// Created a Scanner object called sc.
		Scanner sc = new Scanner(System.in);
		// Print out how many times you will like to loop.
		System.out.println("Please enter the number of Employee you would like to create");
		// Allows you to assign a int value into numberOfEmployees using the scanner object.
		int numberOfEmployees = sc.nextInt();
		// Created a Employee object array name employeeArray that carries the value of numberOfEmployees.
		Employee[] employeeArray = new Employee[numberOfEmployees];
		// Assigning the int value of i to 0.
		int i=0;
		// Using a while loop where the condition states if the value i is less then 
		// the value numberOfEmployees continue executing the loop.
		while(i<numberOfEmployees) {
			// Create new object called currentAgent using the default constructor with 0 parameters.
			Employee emp = new Employee();
			// Prints details of new Employee 
			System.out.println("\n******* Details for new Employee *******");
			// Ask the user to enter employee's number.
			System.out.println("Please enter the new employee's number:");
			// Allows you to assign a Integer value into empNo using the scanner object.
			int empNo = sc.nextInt();
			// Using the Setter Method object to set empNo into new employee object.
			emp.setEmpNo(empNo);
			// Ask the user to enter date of birth.
			System.out.println("Please enter the new employee's date of birth in the format yyyy-MM-dd");
			// Allows you to assign a String value into temp using the scanner object.
			String temp = sc.next();
			// Changing the string temp into datatype Date asigning it to the name dob.
			Date dob = Date.valueOf(temp);
			// Using the Setter Method object to set dob into currentAgent object.
			emp.setBirthDate(dob);
			// Ask the user to enter first name.
			System.out.println("Please enter the new employee's first name");
			// Allows you to assign a String value into f_name using the scanner object.
			String f_name = sc.next();
			// Using the Setter Method object to set f_name into new employee object.
			emp.setFirstName(f_name);
			// Ask the user to enter last name.
			System.out.println("Please enter the new employee's last name");
			// Allows you to assign a String value into l_name using the scanner object.
			String l_name = sc.next();
			// Using the Setter Method object to set l_name into new employee object.
			emp.setLast_name(l_name);
			// Ask the user to enter gender.
			System.out.println("Please enter the new employee's gender (M/F)");
			// Allows you to assign a String value into gender using the scanner object.
			String gender = sc.next();
			// Using the Setter Method object to set gender into new employee object.
			emp.setGender(gender);
			// Ask the user to enter hire date.
			System.out.println("Please enter the new employee's hire date in the format yyyy-MM-dd");
			// Allows you to assign a String value into temp2 using the scanner object.
			String temp2 = sc.next();
			// Changing the string temp2 into datatype Date asigning it to the name hire_date.
			Date hire_date = Date.valueOf(temp2); 
			// Using the Setter Method object to set hire_date into currentAgent object.
			emp.setHireDate(hire_date);
			// Ask the user to enter new employee's salary
			System.out.println("Please enter the new employee's salary");
			// Allows you to assign a Integer value into salary using the scanner object.
			int salary = sc.nextInt();
			// Using the Setter Method object to set Salary into new employee object.
			emp.setSalary(salary);
			// Created an an object array with a value of i to the new employee you created.
			employeeArray[i]=emp; 
			// increment i to plus 1.
			i++;
		}
		// Closing the Scanner class after the while loop has been finished. 
		sc.close();
		
		// Prints out text to show new employeeArray you have created.
		System.out.println("EmployeeArray Details");
		// Using the for loop to print out all the employeeArray you have created.
		// The for loop will stop executing once j is less the the length of employeeArray.
		for(int j =0; j< employeeArray.length; j++) {
			System.out.println(employeeArray[j]);
		}
	}
}