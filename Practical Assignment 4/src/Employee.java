// Imported java.sql.Date to use the Date Class.
import java.sql.Date;

// Created a public class called Employee.
public class Employee {
	// Creating private fields to store data for Employee.
	private static int numberOfEmployees = 0;
	private int empNo;	
	private String firstName;
	private String lastName;
	private String gender;
	private Date birthDate;
	private Date hireDate;
	
	// Created a default constructor which has no parameters.
	public Employee() {
		// Using super to refer to immediate parent class object.
		super();
		// Using this.empNo to reference int empNo.
		// Assigning empNo to int numberOfEmployees++ to increment by one.
		this.empNo = Employee.numberOfEmployees++;  
	}
	
	// Created a second constructor which includes 5 parameters
	// firstName, lastName, gender, birthDate and hireDate.
	public Employee(String first_name, String last_name, String gender, Date birth_date,Date hire_date) {
		// this() refers to the constructor of the class.
		this();
		this.firstName = first_name;
		this.lastName = last_name;
		this.gender = gender;
		this.birthDate = birth_date;
		this.hireDate = hire_date;
	}
	
	// Get method to return the value of empNo.
	public int getEmpNo() {
		return empNo;
	}
	
	// Get method to return the value of firstName.
	public String getFirstName() {
		return firstName;
	}
	
	// Set method used to change the value of firstName.
	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	// Get method to return the value of lastName.
	public String getLastName() {
		return lastName;
	}

	// Set method used to change the value of lastName.
	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}

	// Get method to return the value of gender.
	public String getGender() {
		return gender;
	}

	// Set method used to change the value of gender.
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// Get method to return the value of birthDate.
	public Date getBirthDate() {
		return birthDate;
	}

	// Set method used to change the value of birthDate.
	public void setBirthDate(Date birth_date) {
		this.birthDate = birth_date;
	}


	// Get method to return the value of birthDate.
	public Date gethireDate() {
		return birthDate;
	}

	// Set method used to change the value of birthDate.
	public void setHireDate(Date hire_date) {
		this.hireDate = hire_date;
	}
	
	// Return the object as a string and displays the 6 attributes for the details of Employee.
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("EmpNo:").append(this.empNo);
		sb.append("\tFirstName:").append(this.firstName);
		sb.append("\tLasttName:").append(this.lastName);
		sb.append("\tGender:").append(this.gender);
		sb.append("\tBirthDate:").append(this.birthDate);
		sb.append("\tHireDate:").append(this.hireDate);
		return sb.toString();
	} 

}


