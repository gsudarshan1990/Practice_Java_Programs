package org.strings;

import java.util.Scanner;

/*

Calculate the Factorial of a number

 */
public class Factorial {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which to calculate the factorial");
        int number = scanner.nextInt();
        int fact=1;

        for(int i = number; i >0; i--)
        {
            fact = fact*i;

        }

        System.out.println("Factorial is " + fact);



    }

}
