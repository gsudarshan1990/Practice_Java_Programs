package org.strings;

/*
Calculate Simple Interest
 */

import java.util.Scanner;

public class CalculateInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the Principal");
        int principal =scanner.nextInt();
        System.out.println("Provide the Rate");
        int rate =scanner.nextInt();
        System.out.println("Provide the Time");
        int time =scanner.nextInt();

        int time_in_month = time*12;

        int interest = ((principal * rate * time_in_month)/100);

        System.out.println("Interest calculation:"+interest);



    }
}
