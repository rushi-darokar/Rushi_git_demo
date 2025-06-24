//Non-Parameterized Method

package demo;

public class MathOperation {
	static int num1=20, num2=10;
	static int add,sub,multi,div;
	public static void addition()
	{
		add=num1+num2;
		System.out.println("Addition of two numbers:"+add);
	}
	public static void substraction()
	{
		sub=num1-num2;
		System.out.println("Substraction of two numbers:"+sub);
	}
	public static void multiplication()
	{
		multi=num1*num2;
		System.out.println("Multiplication of two numbers:"+multi);
		
	}
	public static void division()
	{
		div=num1/num2;
		System.out.println("Division of two numbers:"+div);
	}
	
public static void main(String[] args)
{
	addition();
	substraction();
	multiplication();
	division();
}
}
