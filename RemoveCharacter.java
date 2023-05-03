package org.strings;

public class RemoveCharacter {

    public static void main(String[] args)
    {
        String word = new String("Microsoft");
        StringBuffer buffer = new StringBuffer(word);
        buffer.deleteCharAt(3);
        System.out.println(buffer);
    }
}
