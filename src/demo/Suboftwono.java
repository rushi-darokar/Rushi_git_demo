package demo;

public class Suboftwono {
		static int num1=2000;
		static int num2=1000;
		static int sub;
		static int add;
		static int multi;
		public static void substraction() 
		{
			
			sub = num1-num2;
			System.out.println("Substarction of two number:"+sub);
		}
		public static void addition()
		{
			add = num1+num2;
			System.out.println("addition of two number:"+add);
		}
		public static void multiplication()
		{
			multi = num1 * num2;
			System.out.println("Multiplicstion of two number:"+multi);
		}
		public static void main(String[] args) 
		{
			substraction();
			addition();
			multiplication();
		}
		
	
	

}
