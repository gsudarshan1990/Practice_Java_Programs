package org.strings;

import java.util.Scanner;

/*
Write a java program to remove starting and trailing whitespace from a string

<Space><Space><Space><Space>Hello<Space><Space>World<Space>
 */
public class Spaces {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the String to remove starting and trailing whitespace");
        String line = scanner.nextLine();

        System.out.println("Enter the String to remove starting and trailing whitespace "+line.strip());

    }
}
