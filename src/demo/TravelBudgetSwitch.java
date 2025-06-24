package demo;

import java.util.Scanner;

public class TravelBudgetSwitch {
	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int budget;
        
        System.out.println("Enter your travel budget in rupees: ");
        budget = sc.nextInt();
        
        switch (budget)
        {
        	case 500000:
        		System.out.println("You can travel to countries like Europe, Uk, USA");
        		break;
        		
        	case 300000:
        		System.out.println("You can travel to countries like Thailand, Singapore, or UAE.");
        		break;
        		
        	case 100000:
        		System.out.println("You can travel within India to luxury destinations like Goa, Kerala");
        		break;
        		
        	case 50000:
        		System.out.println("You can travel to budget destinations in India like Malvan, Rajasthan");
        		break;
        		
        	case 20000:
        		System.out.println("You can plan a short trip nearby places like Mahabaleshwar, Lonavala");
        		break;
        		
        	default:
        		System.out.println("Invalid budget entered.");
        }
        sc.close();
	}
}