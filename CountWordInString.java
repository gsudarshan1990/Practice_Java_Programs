package org.strings;

import java.util.Scanner;

public class CountWordInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the large string with spaces separated");
        String large = scanner.nextLine();

        String[] words = large.split(" ");
        System.out.println("The number of words "+words.length);

        System.out.println("Enter the large string with comma separated");
        String large1 = scanner.nextLine();
        String[]   words1 = large1.split(",");
        System.out.println("WOrds are the"+words1.length);
        System.out.println("Enter the large string with colon separated");
        String large2 = scanner.nextLine();
        String[]   words2 = large2.split(":");
        System.out.println("WOrds are the"+words2.length);
    }
}
