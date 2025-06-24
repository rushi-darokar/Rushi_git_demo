package demo;

import java.util.Scanner;

public class ReservationSystem {
	
	public static void main(String[] args)
	{
		String category;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your reservation category (OBC, SC, ST, NT, OPEN): ");
		category = sc.next().toUpperCase();
		
		if (category.equals("OBC"))
		{
			System.out.println("You are eligible for 25% reservation.");
		}
		else if (category.equals("SC"))
		{
			System.out.println("You are eligible for 15% reservation.");
		}
		else if (category.equals("ST"))
		{
			System.out.println("You are eligible for 7% reservation.");
		}
		else if (category.equals("NT"))
		{
			System.out.println("You are eligible for 5% reservation.");
		}
		else if (category.equals("OPEN"))
		{
			System.out.println("You are under the General category. No reservation benefits.");
		}
		else
		{
			System.out.println("Invalid category entered. Please check and try again.");
		}
		sc.close();
	}
	

}
