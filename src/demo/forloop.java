package demo;

public class forloop {
	
	public static void main(String[] args) {
	
//		for(int i=3; i<=10; i++)
//		{
//			System.out.println(i*3);
//		}
//		for(int j=10; j>=1; j--)
//		{
//			System.out.println(j);
//		}
		
		String str = "Pune";
		
//		for (int i=0; i<str.length(); i++)
//		{
//			System.out.print(str.charAt(i));
//		}
		
		for (int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
