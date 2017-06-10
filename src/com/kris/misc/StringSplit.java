package com.kris.misc;

import java.util.Scanner;

public class StringSplit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of inputs:");int n = in.nextInt();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elem [ " + i + "] : ");
            input[i] = in.nextLine();
        }

        for (int curr = 0; curr < n; curr++) {
            String s = input[curr];
            String even = "", odd = "";
            int size = s.length();
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    even += s.charAt(i);
                } else odd += s.charAt(i);
            }
            System.out.println(even + " " + odd);
        }
    }
}