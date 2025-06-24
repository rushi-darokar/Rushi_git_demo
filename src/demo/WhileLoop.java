package demo;

//import java.util.Scanner;

public class WhileLoop {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number to print its table: ");
//        int number = sc.nextInt();
//
//        System.out.println("\nTable of " + number + ":");
//        int i = 1;
//        while (i <= 10) {
//            System.out.print(number * i + " ");
//            i++;
//        }
//
//        System.out.println("\n\n-----*-----");
//
//        System.out.println("Reverse Table of " + number + ":");
//        i = 10;
//        while (i >= 1) {
//            System.out.print(number * i + " ");
//            i--;
//        }
//
//        sc.close();
//    }
//}


	public static void main(String[] args) {
		
//		int i = 11;
//		 System.out.println("Using while loop:");
//	        while (i <= 10) {
//	            System.out.println(i);
//	            i++;
//	        }
		
		
		int x = 11;
        System.out.println("\nForce run with x = 11:");
        do {
            System.out.println("x = " + x);  // Will print once even though condition is false
            x++;
        } while (x <= 10);
	}
}



		
