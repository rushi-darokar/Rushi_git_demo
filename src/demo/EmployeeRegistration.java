package demo;

public class EmployeeRegistration {

	 int id,age ;
	 double salary;
	 String name, address, designation,contactNumber ;
	
public static void main(String[] args)
{
    EmployeeRegistration emp1 = new EmployeeRegistration();   //Creates an object named emp1 of the EmployeeRegistration class using the new keyword.

	emp1.id=1;
	emp1.age=28;
	emp1.name="Rohan";
	emp1.address="pune";
	emp1.designation = "Software Engineer"; 
    emp1.contactNumber = "9876543210"; 
    emp1.salary = 50000;
	
	EmployeeRegistration emp2= new EmployeeRegistration();   //Creates an object named emp2 of the EmployeeRegistration class using the new keyword.
	
	emp2.id=2;
	emp2.age=25;
	emp2.name="Rushi";
	emp2.address="Mumbai";
	emp2.designation = "Data analyst"; 
    emp2.contactNumber = "9123456789"; 
    emp2.salary = 45000;
	
    System.out.println("Employee No.1 Deatils");

    System.out.println("Employee ID: " + emp1.id);
    System.out.println("Employee Age: " + emp1.age);
    System.out.println("Employee Name: " + emp1.name);
    System.out.println("Employee Address: " + emp1.address);
    System.out.println("Employee Designation: " + emp1.designation); 
    System.out.println("Employee Contact Number: " + emp1.contactNumber); 
    System.out.println("Employee Salary: " + emp1.salary); 
    
    
    System.out.println("\nEmployee No.2 Deatils");
    System.out.println("Employee ID: " + emp2.id);
    System.out.println("Employee Age: " + emp2.age);
    System.out.println("Employee Name: " + emp2.name);
    System.out.println("Employee Address: " + emp2.address);
    System.out.println("Employee Designation: " + emp2.designation); 
    System.out.println("Employee Contact Number: " + emp2.contactNumber); 
    System.out.println("Employee Salary: " + emp2.salary);
    System.out.println();
	
}	
}

