/* 
  	EDIT THIS FILE SO THAT IT CONTAINS PROCEDURES WHICH CAN BE IMPORTED INTO YOUR MYSQL SCHEMA
	You will need to have sufficent procedures to facilitate menu options 1 to 6
	Informaiton on the correct formation of procedures can be found here

	Note: do not use the key words "BEGIN" and "END" as they are not recognised when the .sql file is being imported. 

	Use the "DROP PROCEDURE" command to allow you to up date existing scripts with subsuequent imports. 
 	Take care if you rename procedures that you DROP the old procedures
*/

-- Option 0 - no procedure required

-- Option 1 
DROP PROCEDURE IF EXISTS getEmployeeCount;
CREATE PROCEDURE getEmployeeCount()
SELECT COUNT(emp_no) AS num FROM oop_employees;

-- Option 2 
DROP PROCEDURE IF EXISTS getAllEmployeesDetails;
CREATE PROCEDURE getAllEmployeesDetails()
SELECT * FROM oop_employees;

-- Option 3
DROP PROCEDURE IF EXISTS getEmployeeByLastName;
/* SEE CREATING PROCEDURES DOCUMENT!!!!*/
CREATE PROCEDURE getEmployeeByLastName(IN empLastName varchar(25))
SELECT * FROM oop_employees WHERE last_name = empLastName;

-- Option 4 
DROP PROCEDURE IF EXISTS insertEmployee;
CREATE PROCEDURE insertEmployee(IN emp_no int(25), birth_date date,first_name varchar(25),last_name varchar(25), gender varchar(25), hire_date date)
INSERT INTO oop_employees VALUES (emp_no, birth_date, first_name, last_name, gender, hire_date);

-- Option 5 - to be defined by student, should involved more than one table
DROP PROCEDURE IF EXISTS deleteEmployee;
CREATE PROCEDURE deleteEmployee(IN id int(25))
DELETE FROM oop_employees WHERE emp_no = id;

-- Option 6 - to be defined by student, should involved more than one table
DROP PROCEDURE IF EXISTS salaryEmployee;
CREATE PROCEDURE salaryEmployee(IN id int(25))
SELECT emp.emp_no, emp.birth_date, emp.first_name, emp.last_name, emp.gender,emp.hire_date, sal.salary
FROM oop_employees emp
INNER JOIN oop_salaries sal
ON emp.emp_no = sal.emp_no
WHERE emp.emp_no = id;