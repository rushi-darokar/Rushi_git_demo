package demo;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int i = 1;
        System.out.println("\nTable of " + number + ":");
        do {
            System.out.print((number * i) + " ");
            i++;
        } while (i <= 10);

        System.out.println("\n\n-----*-----");
        
        i = 10;
        System.out.println("\nReverse Table of " + number + ":");
        do {
            System.out.print((number * i) + " ");
            i--;
        } while (i >= 1);

        sc.close();
    }
}
