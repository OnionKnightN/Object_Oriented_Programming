// Imported java.sql.Date to use the Date Class.
import java.sql.Date;

// Created a public class called Employee.
public class Employee {
	// Creating private fields to store data for Employee.
	
	private int empNo;	
	private Date birthDate;
	private String firstName;
	private String lastName;
	private String gender;
	private Date hireDate;
	private int salary;
	
	// provide the correct arguments to the constructor and assign
	// the parameter values to the appropriate instance variables.(TO DO)
	// Created a default constructor which has no parameters.
	public Employee() {
		// Using super to refer to immediate parent class object.
		super();
	}
	
	// Created a second constructor which includes 6 parameters
	// emp_no, birth_date, first_name, last_name, gender and hire_date.
	public Employee(int emp_no, Date birth_date, String first_name, String last_name, String gender,Date hire_date) {
		// this() refers to the constructor of the class.
		this.empNo = emp_no;
		this.birthDate = birth_date;
		this.firstName = first_name;
		this.lastName = last_name;
		this.gender = gender;
		this.hireDate = hire_date;
	}
	// Created a second constructor which includes 7 parameters
	// emp_no, birth_date, first_name, last_name, gender, hire_date and salary.
	public Employee(int emp_no, Date birth_date, String first_name, String last_name, String gender,Date hire_date,int salary) {
		// this() refers to the constructor of the class.
		this.empNo = emp_no;
		this.birthDate = birth_date;
		this.firstName = first_name;
		this.lastName = last_name;
		this.gender = gender;
		this.hireDate = hire_date;
		this.salary= salary;
	}
	

	
	// Create getter and setter methods for all the instance variables(TO DO)
	// Get method to return the value of empNo.
	public int getEmpNo() {
		return empNo;
	}
	
	// Set method used to change the value of firstName.
	public void setEmpNo(int emp_no) {
		this.empNo = emp_no;
	}

	// Get method to return the value of birthDate.
	public Date getBirthDate() {
		return birthDate;
	}

	// Set method used to change the value of birthDate.
	public void setBirthDate(Date birth_date) {
		this.birthDate = birth_date;
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
	

	// Get method to return the value of hireDate.
	public Date gethireDate() {
		return hireDate;
	}

	// Set method used to change the value of hireDate.
	public void setHireDate(Date hire_date) {
		this.hireDate = hire_date;
	}
	
	// Get method to return the value of salary.
	public int getSalary() {
		return salary;
	}

	// Set method used to change the value of salary.
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// Create a to string method which will return a single string containing all the values of an employee object.(TO DO)
	// Return the object as a string and displays the 7 attributes for the details of Employee.
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("EmpNo:").append(this.empNo);
		sb.append(", BirthDate:").append(this.birthDate);
		sb.append(", FirstName:").append(this.firstName);
		sb.append(", LasttName:").append(this.lastName);
		sb.append(", Gender:").append(this.gender);
		sb.append(", HireDate:").append(this.hireDate);
		sb.append(", Salary:").append(this.salary);
		return sb.toString();
	} 
}


