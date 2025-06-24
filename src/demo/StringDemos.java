package demo;

public class StringDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="rushi ";
//		String str1=" ";
//		System.out.println(str.toUpperCase());
//		System.out.println(str.length());
//		System.out.println(str.contains("ush"));
//		System.out.println(str1.isEmpty());
//		System.out.println(str.endsWith("i"));
//

//		//Reserved string :
//    for(int i=str.length()-1;i>=0;i--)
//    {
//    	
//    	System.out.print(str.charAt(i));
//    }


	
	
//	String a = "Test";
//	String b = new String("Test");
//	System.out.println(a == b);       //== checks reference equality (memory location) //equals() checks content equality.
//	System.out.println(a.equals(b));
//	
	
//	String reversed =new StringBuilder(str).reverse().toString();
//	System.out.println(reversed);    //using inbuilt functions reversed  string
//	
	
//	
//	String rev=new StringBuilder(str).reverse().toString();  //.reverse()
//	System.out.println(rev);							    //This is a method from the StringBuilder class. 
															//It reverses the characters in the StringBuilder.
															//.toString()	Converts it back to a String.
	
		String str1 = "madam";
		boolean isPalindrome = str1.equals(new StringBuilder(str1).reverse().toString());
		System.out.println(isPalindrome); // true

	
	
}}
	


