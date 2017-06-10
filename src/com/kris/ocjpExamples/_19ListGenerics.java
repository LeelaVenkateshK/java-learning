package com.kris.ocjpExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _19ListGenerics {
    public static void main(String[] a) {
        List list = new ArrayList(Arrays.asList(1, "two", '3'));
        for (Object l : list) {
            System.out.print(l);
        }
    }
}