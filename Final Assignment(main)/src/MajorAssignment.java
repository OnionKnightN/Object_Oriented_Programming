import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import util.DBConnect;
/**
 * FOLLOW THE COMMENTS CAREFULLY TO COMPLETE THIS FILE
 * 
 * A user menu facilitates interaction with a MySQL schema by calling methods from this file 
 * which execute SQL procedures stored in a MYSQL schema. Connection to this is specified by the user.
 * Ensure that the correct name for the style of connection (setUpForLocalMySQL or setUpForKnuthMySQL) you are using is accessible (uncommented)
 * 
 * Common Errors
 * - "The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server."
 *    - Your MySQL server is not running
 *    - There is no MySQL server running on the port you have specified
 * 
 * @author Alex Cronin
 */
public class MajorAssignment {

	public static void main(String[] args) {
		System.out.println("MajorAssignment.java - starting main method\n");
		// Create a scanner to accept input from the user
		Scanner sc = new Scanner(System.in);
		// Create a DBConnect object and open a connection
		DBConnect dbc2 = new DBConnect();
		//Knuth login details for dbc2.setUpForKnuthMySQL("mysqlUsername", "mysqlPassword", "mysqlDatabaseName", "sshUsername", "sshPassword");
		dbc2.setUpForKnuthMySQL("s2989969", "olositin", "s2989969", "s2989969", "olositin");
		// Opening the Connection to Knuth using dbc2.openConnection()
		dbc2.openConnection();
		// Below are two options ( a and b) for how to access your MySQL . 
		// - Comment out the option you DO NOT want
		// - then fill in the appropriate values in the constructor
		// a) Use the option below if you are accessing MySQL on your local machine
		// b) Use the option below if you are accessing MySQL over an SSH connection 
		// Open the connection - call the correct method on the correct object
		
		do {
			// Menu of the application
			System.out.println("\n===========================================================");
			System.out.println("USER MENU");
			System.out.println("Please select an option by typing the corresponding number.");
			System.out.println("0. Exit");				
			System.out.println("1. Display the count of the employees.");
			System.out.println("2. Display records of all employees.");
			System.out.println("3. Search for an employee by last name.");
			System.out.println("4. Add a new employee.");
			System.out.println("5. Delete an employee.");				
			System.out.println("6. View salary of employee.");
			System.out.println("===========================================================");
			System.out.print("option> ");
			
			// Initialize a variable of the correct type called option to store the value entered by the user 
			int option = sc.nextInt();
			/**
			 * When the user selects an option of 7 options are executed. 
			 * 		Option 0 and 1 specified. 
			 * 		You must specify options 2 to 6. 
			 * Each option will call a method below
			 * 		No method is required for option 0. 
			 * 		Method for option 1 is specified below. 
			 * 		You must specify methods of option 2 to 6. 
			 */
			// 0. exit the program 
			if (option == 0) {
				System.out.println("Exiting the program");
				//exit the while loop
				break;
			}
			// 1. Display the count of the employees
			else if (option == 1) {
				// Storing the getEmployeeCount method into integer variable count.
				int count = MajorAssignment.getEmployeeCount(dbc2.getConnection());
				// Print out and display the count employees in the database.
				System.out.println("Count of Employees in Database is " + count);
			}
			// 2. displaying all employees 
			else if (option == 2) {
				// Prints out the heading called Details of Employees.
				System.out.println("Details of Employees"+"\n");
				// Storing the getEmployeeCount method into integer variable count
				int count = MajorAssignment.getEmployeeCount(dbc2.getConnection());
				// Storing the getAllEmployeesDetails method into object Array variable details
				// Used the count integer to indicate size of Array list.
				Employee [] details = MajorAssignment.getAllEmployeesDetails(dbc2.getConnection(),count);
				//Using a for loop to print out and display all employees in the database.
				for(int i =0; i< details.length; i++) {
					System.out.println("Employee #" + (i+1) +" Employee [" + details[i] + "]");
				}
			}
			// 3. search for an employee by last name
			else if (option == 3) {
				// Ask the user to enter a the last name of employee.
				System.out.println("Enter the last name of the employee you would like search");
				// Allows you to assign a string value into empLastName using the scanner object.
				String empLastName = sc.next();
				// Prints out the heading called Details of Employees with the last name.
				System.out.println("Details of the employee with the lastname " + empLastName + ".");
				// Storing the getEmployeeByLastName method into object Array variable lastName.
				ArrayList<Employee> lastName = MajorAssignment.getEmployeeByLastName(dbc2.getConnection(), empLastName); 
				//Prints out the value of last name.
				System.out.println(lastName); 
			}
			// 4. adding an employee
			else if (option == 4) {
				// Ask the user to enter the number of new employees.
				System.out.println("Please enter the number of employees you would like to add?");
				// Allows you to assign a Integer value into numberOfEmployees using the scanner object.
				int numberOfEmployees = sc.nextInt();
				// Assigning the int value of i to 0.
				int i=0;
				// Using a while loop where the condition states if the value i is less then 
				// the value numberOfEmployees continue executing the loop.
				while(i<numberOfEmployees) {
					// Prints details of new Employee 
					System.out.println("\n****** Details for new Employee *******");
					// Ask the user to enter employee's number.
					System.out.println("Please enter the new employee's number:");
					// Allows you to assign a Integer value into emp_no using the scanner object.
					int emp_no = sc.nextInt();
					// Ask the user to enter date of birth.
					System.out.println("Please enter the new employee's date of birth in the format YYYY-MM-DD:");
					// Allows you to assign a String value into birth_date using the scanner object.
					String birth_date = sc.next();
					// Changing the string birth_date into data type Date asigning it to the name dob.
					Date dob = Date.valueOf(birth_date);
					// Ask the user to enter first name.		
					System.out.print("Please enter the new employee's first name:");
					// Allows you to assign a String value into first_name using the scanner object.
					String first_name = sc.next();
					// Ask the user to enter last name.
					System.out.print("Please enter the new employee's last name: ");
					// Allows you to assign a String value into last_name using the scanner object.
					String last_name = sc.next();
					// Ask the user to enter gender.
					System.out.print("Please enter the new employee's Gender(M/F): ");
					// Allows you to assign a String value into gender using the scanner object.
					String gender = sc.next();
					// Ask the user to enter hire date.
					System.out.println("Please enter the new employee's hire date in the format YYYY-MM-DD:");
					// Allows you to assign a String value into hire_date using the scanner object.
					String hire_date = sc.next();
					// Changing the string hire_date into data type Date asigning it to the name hd.
					Date hd = Date.valueOf(hire_date); 
					// Storing the insertEmployee method into String variable action with the inputs given above from the user.
					String action = MajorAssignment.insertEmployee(dbc2.getConnection(), emp_no, dob, first_name, last_name, gender, hd);
					// Prints out the string of the action of a new inserted new employees with its id.
					System.out.print(action + emp_no + "\n"); 
					// increment i to plus 1.
					i++;
				}
			}
			// 5. Delete an employee 
			else if (option == 5) {
				// Asked the user which employee they wish to delete based on the employees id
				System.out.println("Enter the id of the employee you would like to delete?");
				// Allows you to assign a Integer value into id using the scanner object.
				int id = sc.nextInt();
				// Storing the deleteEmployeee method into String variable empDelete with the inputs given above from the user.
				String empDelete = MajorAssignment.deleteEmployee(dbc2.getConnection(), id);
				// Prints out the string of the deleted employees with its id.
				System.out.println(empDelete + id + ".");
			}	
			
			// 6. View salary of employee
			else if (option == 6) {
				// Asked the user which employee salary they wish to view based on the employees id
				System.out.println("Enter the id of the employee to view his or her details and salary");
				// Allows you to assign a Integer value into id using the scanner object.
				int id = sc.nextInt();
				// Storing the salaryEmployee method into object Array variable empSalary with the inputs given above from the user.
				ArrayList<Employee> empSalary = MajorAssignment.salaryEmployee(dbc2.getConnection(), id);
				// Prints out the heading of Details and Salary of Employee ID
				System.out.println("\n******" + "Details and Salary of Employee ID " + id + "." + "******");
				// Prints out the Array object of Details and Salary of Employee ID
				System.out.println(empSalary);
			}	

			// Invalid option
			else {
				System.out.println("Invalid option.");
			}
		//loop until option 0 is selected
		}while(true); 
		// Close the connection
		dbc2.closeConnection();
		// Close the scanner
		sc.close();
		// prints out the end of the method.
		System.out.println("MajorAssignment.java - ending main method\n");
	}

	/**
	 * THE FOLLOWING METHODS CALL SQL PROCEDURES STORED IN YOUR MYSQL SCHEMA AND 
	 * RETURNs THE RESULTS TO THE IF/ELSE BLOCKS ABOVE WHERE THEY WERE CALLED
	 * 
	 * Each method calls one or more stored SQL procedures from our MySQL schema 
	 * There is currently have one SQL procedure defined in the provided procedures.sql file 
	 * located in the data folder. 
	 * You will need to 
	 * 	- Create additional procedures in procedures.sql
	 * 	- Import them into your schema using Import.java
	 * 	- Write code in the if/else blocks above to call java methods below which in turn call procedures in your MySQL schema
	 * 	- All of these steps combined should enable you to have 7 options (0 to 6) on your user menu.
	 * Using option 1 as a template you must implement option 2 to 6. 
	 * 
	 * The general format of these methods is as follows
	 *  - give the method an appropriate access modifier, return type, name & parameters
	 *  - Create a string containing an SQL statement which calls a procedure
	 *  - Create a statement
	 *  - Create a results set by executing your statement on the MySQL schema
	 *  - Return the results set as a java primitive or object
	 *  - Close the statement
	 *  - Close the results set
	 */

	/**
	 * Option 0 - Exit the program. No method to call SQL required. 
	 */

	/**
	 * Option 1 - Display the count of the employees
	 * @param conn - the connection to the MySQL schema 
	 * @return count of employess
	 */
	public static int getEmployeeCount(Connection conn) {
		// Assigning num to 1
		int num = 1;
		// Using the try statement to execute SQL database.
		try {
			// Create the SQL query string which uses the "getEmployeeCount" stored procedure in the employee.
			// Assigning CALL getEmployeeCount() into a string called SQL
			String sql = "CALL getEmployeeCount()";
			// Create a new SQL statement 
			Statement st = conn.createStatement();
			// Create a new results set which store the value returned by the  when the sql statement is executed  
			ResultSet rs = st.executeQuery(sql); 
			// While there is still information from sql detail continue executing.
			while (rs.next()) 
				num = rs.getInt(1); // assign the next int in the results set to num
				// Close the results set
				rs.close(); 
				// Close the statement
				st.close(); 
		}
		// if there is an Error in the SQL this will print out
		catch (SQLException e) {
			System.out.println("Error in getEmployeeCount");
			e.printStackTrace();
		}
		// Returns the integer value num based on mySQL procedure
		return num;		
	}

	/**
	 * Option 2 - Display records of all the employees 
	 * @param conn - the connection to the MySQL schema 
	 * @return records of all the employees 
	 */
	public static Employee[] getAllEmployeesDetails(Connection conn, int empNum) {
		// Created an Array for Employees that takes in an integer from the method above
		Employee [] empArray = new Employee[empNum];
		// Using the try statement to execute SQL database.
		try {
			// Create the SQL query string which uses the "getAllEmployeesDetails" stored procedure in the employee.
			// Assigning CALL getEmployeeCount() into a string called SQL
			String sql = "CALL getAllEmployeesDetails()";
			// Create a new SQL statement 
			Statement st = conn.createStatement();
			// Create a new results set which store the value returned by the  when the sql statement is executed 
			ResultSet rs = st.executeQuery(sql); 
			// Assigning i to 1
			int i=0;
			// While there is still information from sql detail continue executing. 
			while (rs.next()) 
				//TODO Expand this constructor call to take more arguments.
				// Used the Employee constructor with the parameters based on the mysql procedure for option 2.
				empArray[i++] = new Employee(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6)); 
				// Close the results set
				rs.close(); 
				// Close the statement
				st.close();
			}
		// if there is an Error in the SQL this will print out
		catch (SQLException e) {
			System.out.println("Error in getAllEmployeesDetails");
			e.printStackTrace();
		}
		//Return the employee array
		return empArray;
	}

	/**
	 * Option 3 - Search for an employee by last name
	 * @param conn - the connection to the MySQL schema 
	 * @return employee by last name
	 */
	public static ArrayList<Employee> getEmployeeByLastName(Connection conn, String empLastName) { 
		// Created a new object Array called emp
		ArrayList<Employee> emp = new ArrayList<>(); 
		// Using the try statement to execute SQL database.
		try {
			// Create the SQL query string which uses the  "getEmployeeByLastName" stored procedure in the employee 
			// Assigning CALL getEmployeeByLastName('"+empLastName+"')) into a string called SQL.
			// empLastName will be assigned by the user in option 3 above
			String sql = "CALL getEmployeeByLastName('"+empLastName+"')";
			// Create a new SQL statement 
			Statement st = conn.createStatement();
			// Create a new results set which store the value returned by the  when the SQL statement is executed  
			ResultSet rs = st.executeQuery(sql); 
			// Created an object empLast that is null
			Employee empLast = null;
			// While there is still information from sql detail continue executing.
			while (rs.next()) 
				// TODO Expand this constructor call to take more arguements
				// Inputing details into empLast using the constructor based on details in the mySQL procedure.
				empLast = new Employee(rs.getInt("emp_no"), rs.getDate("birth_date"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("gender"), rs.getDate("hire_date")); 
				// Adding the emplast object into the emp object Array
				emp.add(empLast); 
				// Close the results set
				rs.close(); 
				// Close the statement
				st.close(); 
		}
		// if there is an Error in the SQL this will print out
		catch (SQLException e) { 
			System.out.println("Error in getEmployeeByLastName");
			e.printStackTrace();
		}
		// returns the object Array emp based on mySQL procedure.
		return emp;
	}

	/**
	 *  Option 4 - Add a new employee. This method need only alter the Employee table
	 * @param conn - the connection to the MySQL schema 
	 * @param emp - the employee to add
	 */
	public static String insertEmployee(Connection conn, int emp_no, Date birth_date, String first_name, String last_name, String gender, Date hire_date) {
		// Using the try statement to execute SQL database.
		try {
			// Create the SQL query string which uses the  "insertEmployee" stored procedure in the employee 
			// Assigning "CALL insertEmployee('"+emp_no+"','"+birth_date+"','"+first_name+"','"+last_name+"','"+gender+"','"+hire_date+"')" into a string called SQL.
			// The parameters will be assigned by the user in option 4 above
			String sql = "CALL insertEmployee('"+emp_no+"','"+birth_date+"','"+first_name+"','"+last_name+"','"+gender+"','"+hire_date+"')";
			// Create a new SQL statement 
			Statement st = conn.createStatement();
			// Create a new results set which store the value returned by the  when the sql statement is executed 
			ResultSet rs = st.executeQuery(sql); 
			// Close the results set
			rs.close(); 
			// Close the statement
			st.close();
		}
		// if there is an Error in the SQL this will print out
		catch (SQLException e) { 
			System.out.println("Error in insertEmployee");
			e.printStackTrace();
		}
		// Return a string to say you have added a new employee.
		return "You have added a new employee with the id ";
		}
	/**
	 * 	Option 5 - Delete Employee based on ID 
	 * @param conn - the connection to the MySQL schema 
	 */
	public static String deleteEmployee(Connection conn, int id) {
		// Using the try statement to execute SQL database.
		try {
			// Assigning CALL deleteEmployee('"+id+"') into a string called SQL.
			// The parameters will be assigned by the user in option 5 above 
			String sql = "CALL deleteEmployee('"+id+"')";
			// Create a new SQL statement 
			Statement st = conn.createStatement();
			// Create a new results set which store the value returned by the  when the sql statement is executed 
			ResultSet rs = st.executeQuery(sql); 
			// Close the results set
			rs.close(); 
			// Close the statement
			st.close(); 
		}
		// if there is an Error in the SQL this will print out
		catch (SQLException e) { //Catching errors
			System.out.println("Error in deleteEmployee");
			e.printStackTrace();
		}
		// Return a string to say you have delete an employee.
		return "You have deleted an employee with the id ";
	}
	/**
	 * 	Option 6 - View salary of employee 
	 * @param conn - the connection to the MySQL schema 
	 * @return Object ArrayList Employee salary
	 */

	public static ArrayList<Employee> salaryEmployee(Connection conn, int id) {
		// Created a new object Array called emp
		ArrayList<Employee> emp = new ArrayList<>(); 
		// Using the try statement to execute SQL database.
		try {
			// Assigning salaryEmployee('"+id+"')" into a string called SQL.
			// The parameters will be assigned by the user in option 6 above  
			String sql = "CALL salaryEmployee('"+id+"')";
			// Create a new SQL statement 
			Statement st = conn.createStatement();
			// Create a new results set which store the value returned by the  when the SQL statement is executed 
			ResultSet rs = st.executeQuery(sql); 
			// Created an object empSal that is null
			Employee empSal = null;
			// While there is still information from sql detail continue executing.
			while (rs.next()) 
				// Inputing details into empSal using the constructor based on details in the mySQL procedure.
				empSal = new Employee(rs.getInt("emp_no"), rs.getDate("birth_date"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("gender"),rs.getDate("hire_date"), rs.getInt("salary")); //TODO Expand this constructor call to take more arguements
				// Adding the empSal object into the emp object Array
				emp.add(empSal);	
				// Close the results set
				rs.close(); 
				// Close the statement
				st.close(); 
		}
		// if there is an Error in the SQL this will print out
		catch (SQLException e) { 
			System.out.println("Error in getEmployeeByLastName");
			e.printStackTrace();
		}
		// Returns the object Array emp based on mySQL procedure.
		return emp;
	}
}