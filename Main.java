//Write a program to get the count of even number in an arraylist take the input from the user.

package org.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the size of the arraylist");
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        List<Integer> nums= new ArrayList<Integer>();
        for(int i =0;i< number;i++)
        {
            nums.add( sc.nextInt());
        }
        System.out.println(nums);
        int count = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) % 2 == 0)
                count++;
        }
        System.out.println(count);
    }
}