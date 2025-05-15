package GitDemo;

import java.util.Scanner;

public class SchoolAttendance 
{
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");			       			 	// Taking count of students in the class from user
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  															

        
        String[] studentNames = new String[numberOfStudents];							// Array to store student names

        String[] attendance = new String[numberOfStudents];					        	// Array to store attendance (Present/Absent)


        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.print("Enter name of student " + (i + 1) + ": ");				// Take student names from user
            studentNames[i] = scanner.nextLine();
        }


        System.out.println("\nMark attendance (P for Present, A for Absent):");		 
        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.print("Is " + studentNames[i] + " present? (P/A): ");			 // Take attendance from user
            String status = scanner.nextLine().toUpperCase();
            if (status.equals("P")) 
            {
                attendance[i] = "Present";
            } else {
                attendance[i] = "Absent";
            }
        }
        
        System.out.println("\n--- Attendance Report ---");
        for (int i = 0; i < numberOfStudents; i++) 
        {
        	
            System.out.println(studentNames[i] + " - " + attendance[i]);			  // Display attendance
        }

        scanner.close();
    }
}

