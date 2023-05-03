package org.strings;

/*
Write the java program to count number of uppercase characters, lowercase characters, digits and special characters
JavA5is&Su6p%eR
 */

import java.lang.Character;
import java.util.Scanner;

public class ProgramToCountCharacterFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to count");
        String str = scanner.nextLine();
        int[] count = new int[4];
        char ch;
        for(int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if (Character.isDigit(ch)) {
                count[0]++;
            } else if (Character.isUpperCase(ch)) {
                count[1]++;

            } else if (Character.isLowerCase(ch)) {
                count[2]++;

            } else {
                count[3]++;
            }
        }

        System.out.println("Count of Digit "+count[0]);
        System.out.println("Count of Uppercase "+count[1]);
        System.out.println("Count of LowerCase "+count[2]);
        System.out.println("Count of Special "+count[3]);
    }
}
