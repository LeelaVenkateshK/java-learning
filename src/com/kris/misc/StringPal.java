package com.kris.misc;

import java.util.Scanner;

public class StringPal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] array = A.toCharArray();
        int len = array.length;
        String s = "";
        for (int i = len - 1; i >= 0; i--) {
            s += array[i];
        }
        System.out.println(s.equals(A) ? "yes" : "no");

    }
}
