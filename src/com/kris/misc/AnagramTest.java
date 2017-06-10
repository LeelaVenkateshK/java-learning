package com.kris.misc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * An anagram is a word which is formed by rearranging letters of an existing word
 * ex : spar and rasp
 */
public class AnagramTest {
    static boolean isAnagram(String a, String b) {
        char[] arrayA = a.toLowerCase().toCharArray(), arrayB = b.toLowerCase
                ().toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        System.out.println("a : " + new String(arrayA) + " :: b: " + new
                String(arrayB));
        a = new String(arrayA);
        b = new String(arrayB);
        if (a.equalsIgnoreCase(b))
            return true;
        else return false;
        // Complete the function by writing your code here.

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
