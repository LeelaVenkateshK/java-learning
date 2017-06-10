package com.kris.ocjpExamples;

class _4ArrayCompare {

    public static void main(String[] a) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("a1==a2" + (arr1 == arr2));
        System.out.println("a1.equals(a2)" + arr1.equals(arr2));
        System.out.println("java.util.Arrays.equals(a1,a2)" + java.util.Arrays.equals(arr1, arr2));
    }
}