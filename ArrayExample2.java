package org.strings;

import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {

        String[] array = {"Ram","Rahul","Kedar","Umesh","Nehra"};

        String[] array2 =array.clone();

        String[] array3 = Arrays.copyOf(array,array.length);

        String[] array4 =new String[array.length];

        System.arraycopy(array,0,array4,0,array.length);

        System.out.println("--------------------------------");

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array2[i]);
        }


        System.out.println("--------------------------------");

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array3[i]);
        }


        System.out.println("--------------------------------");

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array4[i]);
        }

    }
}
