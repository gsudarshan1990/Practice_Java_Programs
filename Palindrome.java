package org.strings;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
        char reversed[] = new char[charArray.length];
        for (int i = 0,j=charArray.length-1; i <=charArray.length-1 && j>=0; i++,j--)
        {
            reversed[i] = charArray[j];
        }

        String new_word = new String(reversed);

        if(word.equalsIgnoreCase(new_word))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }

    }
}
