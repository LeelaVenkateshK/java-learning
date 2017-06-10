package com.kris.collectionsLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubListTest {
    public static void main(String[] args) {
        List<String> parentList = new ArrayList<>();
        parentList.addAll(Arrays.asList("s1", "s2", "s3", "s4"));
        List<String> subList = parentList.subList(1, 2);
        System.out.println("Sub List :: " + subList);
        subList.add("at s3");
        System.out.println("Sub List :: " + subList);
        System.out.println("main list ::: " + parentList);
    }
}