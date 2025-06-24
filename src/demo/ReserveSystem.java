package demo;

import java.util.Scanner;

public class ReserveSystem {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category;

        System.out.println("Enter your reservation category (OBC, SC, ST, NT, OPEN): ");
        category = sc.next().toUpperCase(); 

        switch (category) 
        {
            case "SC":
                System.out.println("You are eligible for 15% reservation.");
                break;
            case "ST":
                System.out.println("You are eligible for 7.5% reservation.");
                break;
            case "OBC":
                System.out.println("You are eligible for 20% reservation.");
                break;
            case "NT":
                System.out.println("You are eligible for 5% reservation (depending on sub-category).");
                break;
            case "OPEN":
                System.out.println("You are under the General category. No reservation benefits.");
                break;
            default:
                System.out.println("Invalid category entered. Please check and try again.");
        }

        sc.close();  
    }
}

