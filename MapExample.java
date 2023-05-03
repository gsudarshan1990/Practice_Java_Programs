package org.strings;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
    Separate Keys and Values from Map Example
 */
public class MapExample {

    public static void main(String[] args)
    {
        Map<String,Integer> map = new Hashtable<>();
        map.put("Rahul",32);
        map.put("Rohit",34);
        map.put("Virat",31);
        map.put("Pant",29);
        map.put("Dravid",42);


        System.out.println(map);

        System.out.println("--------------------------------");

        Set<Map.Entry<String,Integer>> entry=map.entrySet();

        for(Map.Entry<String,Integer> set1:entry)
        {

            System.out.println("--------------------------------");
            System.out.println(set1.getKey());
            System.out.println("--------------------------------");
            System.out.println(set1.getValue());
        }
    }
}
