package org.strings;

import java.util.Locale;
import java.util.Scanner;

/*
Compare two strings if the characters in the first string are present in the second string then the character should be printed in the output otherwise
'+' should be printed

 */
public class String_Comparission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String first = scanner.nextLine();
        System.out.println("Enter the second string");
        String second = scanner.nextLine();

        String firstupper = first.toUpperCase();
        String secondupper = second.toUpperCase();

        StringBuffer third= new StringBuffer();



        for(int i=0;i<first.length();i++) {
            char ch = firstupper.charAt(i);

           if(secondupper.contains(String.valueOf(ch)))
           {
               third.append(ch);
           }
           else {
               third.append('+');
           }

        }

        System.out.println("The new string is"+third.toString());

    }
}
