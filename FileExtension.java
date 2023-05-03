package org.strings;

import java.util.Scanner;

/*
Write a Java program to print the extension of the file.
 */
public class FileExtension {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the filename with extension");
        String filename = scanner.nextLine();

       int period_value =filename.indexOf('.');

       System.out.println(filename.substring(period_value+1));
       System.out.println(filename.substring(0,period_value));

    }
}
