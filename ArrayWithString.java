package org.strings;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a java program that creates a array of strings that are at even positions

Java is super keka easy and awesomeness.
 */
public class ArrayWithString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String data = scanner.nextLine();


        String[] string_split =data.split(" ");

        ArrayList<String> strings = new ArrayList<String>();

    for(int i =0; i <string_split.length; i++) {

        if((i%2)==0)
        {
            strings.add(string_split[i]);
        }
        }

        String[] array_string =  strings.toArray(new String[strings.size()]);

        for(int j=0; j<array_string.length;j++)
        {
            System.out.println(array_string[j]);
        }
    }
}
