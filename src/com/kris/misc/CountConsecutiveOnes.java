package com.kris.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountConsecutiveOnes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to
        STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 2);
            num /= 2;
        }
        int count = list.contains(1) ? 1 : 0, len = list.size();
        for (int i = 0; i < len; i++) {
            System.out.print(list.get(i));
            if (i + 1 != len && list.get(i) == 1 && list.get(i + 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}