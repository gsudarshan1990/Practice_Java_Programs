///Identify all the even values in a list of integers and organise them ascendingly.

package org.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args)
    {

        System.out.println("Enter the size of the arraylist");
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        List<Integer> Numbers = new ArrayList<>();
        for(int i =0;i< number;i++)
        {
            Numbers.add( sc.nextInt());
        }

       List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : Numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);
    }
}

