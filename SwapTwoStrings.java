package org.strings;

import java.util.Scanner;

public class SwapTwoStrings {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String to swap");
        StringBuffer one = new StringBuffer(scanner.nextLine());
        System.out.println("Enter the second String to swap");
        StringBuffer two = new StringBuffer(scanner.nextLine());

        StringBuffer three = new StringBuffer(two.toString());
        two = new StringBuffer(one.toString());
        one = new StringBuffer(three.toString());

        System.out.println(one);
        System.out.println(two);

    }
}
