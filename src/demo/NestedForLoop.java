package demo;

public class NestedForLoop {

	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("Tabel of " + i); 
			
			for (int j = 1; j <= 10; j++)
			{
				System.out.print(j * i + " ");
			}
			
			System.out.println("\n");			
		}

	}

}
