package demo;

import java.util.Scanner;

public class TravelBudget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget;

        System.out.println("Enter your travel budget in rupees: ");
        budget = sc.nextInt();

        if (budget > 500000) 
        {
            System.out.println("You can travel to countries like Europe, Uk, USA");
        } 
        else if (budget > 300000 && budget <= 500000) 
        {
            System.out.println("You can travel to countries like Thailand, Singapore, or UAE.");
        } 
        else if (budget > 100000 && budget <= 300000) 
        {
            System.out.println("You can travel within India to luxury destinations like Goa, Kerala");
        } 
        else if (budget > 50000 && budget <= 100000) 
        {
            System.out.println("You can travel to budget destinations in India like Malvan, Rajasthan");
        }
        else if (budget > 0 && budget <= 50000) 
        {
            System.out.println("You can plan a short trip nearby places like Mahabaleshwar, Lonavala");
        } 
        else {
            System.out.println("Invalid budget entered.");
        }

        sc.close();
    }
}
