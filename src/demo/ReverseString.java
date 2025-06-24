package demo;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		String str = "Indian";
		
		System.out.print("Reverse string of " + str + " is: " );	
		for (int i = str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
