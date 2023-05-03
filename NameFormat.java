package org.strings;

import java.util.Scanner;



/*
Given the firstname and the lastname , print the last name followed by the "," character and first letter of the first name
 */
public class NameFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the firstname");
        String firstname = scanner.nextLine();
        System.out.println("Enter the lastname");
        String lastname = scanner.nextLine();

        String new_name_initial= new String(lastname+","+firstname.charAt(0));

        StringBuffer new_name= new StringBuffer(lastname+","+firstname.charAt(0));
        System.out.println("Enter the new name "+new_name.toString());

        System.out.println(new_name_initial);

    }
}
