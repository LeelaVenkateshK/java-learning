package com.kris.misc;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateEAN13 {
    public static void main(String[] args) {
        Long longnum = ThreadLocalRandom.current().nextLong(999999999999L);
        System.out.println(longnum);
        System.out.println("Bar Code is : " + generateBarCode(longnum));
    }

    private static Long generateBarCode(Long longnum) {
        int count = 0;
        long sum = 0;
        for (long l = longnum; l > 0; l /= 10, count++) {
            if (count % 2 == 0)
                sum += l % 10 * 3;
            else
                sum += l % 10;
        }
        return (longnum * 10 + 10 - sum % 10);
    }
}
