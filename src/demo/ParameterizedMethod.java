//Parameterized method 

package demo;

public class ParameterizedMethod {

	public static void addition(int num1, int num2)
	{
		int add=num1+num2;
		System.out.println("Addition of two numbers :"+ add);
	}
	public static void substraction(int num1,int num2)
	{
		int sub=num1-num2;
		System.out.println("Substraction of two numbers : "+sub);
	}
	public static void multiplication(int num1,int num2)
	{
		int multi=num1*num2;
		System.out.println("Multiplication of two numbers : "+multi);
		
	}
	public static void division(int num1, int num2 )
	{
		int div=num1/num2;
		System.out.println("Division of two numbers : "+div);
		
	}
	public static void main(String[] args) 
	{
		addition(10,20);
		substraction(20,10);    // Calls each method and passes specific values as arguments. 
		multiplication(5,6);
		division(25,5);
		
				
	}

}
