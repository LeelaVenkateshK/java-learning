package com.kris.misc;

public class TestPrimitiveAndWrapper {
    public static void main(String[] args) {
        int[] array = new int[1];
        array[0] = 1;
        Integer[] wrapperArray = new Integer[1];
        wrapperArray[0]=1;
        System.out.println("array.equals(wrapperArray)  :: " + (array.equals
                (wrapperArray)));
        System.out.println("wrapperArray.equals(array)  :: " + (wrapperArray
                .equals(array)));
    }
}
