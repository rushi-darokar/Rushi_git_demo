package demo;

import java.util.Scanner;

public class Dynamic_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string :  " );
		String str = sc.nextLine();
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
	}
	

}
