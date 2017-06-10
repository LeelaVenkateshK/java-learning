package com.kris.misc;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to print tables for : ");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        in.close();
    }
}
