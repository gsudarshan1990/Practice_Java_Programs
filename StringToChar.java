package org.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringToChar {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be converted to a char");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++)
        {
            System.out.println(ch[i]);
        }



        String charToWord = new String(ch);
        System.out.println(charToWord);



        byte[] word=str.getBytes();

        for (int i = 0; i <word.length; i++)
        {
            System.out.println(word[i]);
        }
        System.out.println(new String(word));


    }
}
