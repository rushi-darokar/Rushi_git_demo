package demo;

import java.util.Scanner;

public class gitpractice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");			       			 	// Number of students in the class
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  															

        
        String[] studentNames = new String[numberOfStudents];							// Array to store student names

        String[] attendance = new String[numberOfStudents];					        	// Array to store attendance (Present/Absent)


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");				// Input student names
            studentNames[i] = scanner.nextLine();
        }


        System.out.println("\nMark attendance (P for Present, A for Absent):");		 
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Is " + studentNames[i] + " present? (P/A): ");			 // Take attendance
            String status = scanner.nextLine().toUpperCase();
            if (status.equals("P")) {
                attendance[i] = "Present";
            } else {
                attendance[i] = "Absent";
            }
        }

        
        
        
        System.out.println("\n--- Attendance Report ---");
        for (int i = 0; i < numberOfStudents; i++) {
        	
            System.out.println(studentNames[i] + " - " + attendance[i]);			  // Display attendance
        }

        scanner.close();
    }
}

