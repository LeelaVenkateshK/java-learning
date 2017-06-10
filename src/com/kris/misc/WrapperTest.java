package com.kris.misc;

class WrapperTest {
    public static void main(String args[]) {
        Integer i = 10;
        Integer j = 11;
        Integer k = ++i;
        System.out.println("k==j :: " + (k == j));
        System.out.println("k.equals(j) :: " + (k.equals(j)));
        System.out.println("k.equals(11) :: " + (k.equals(11)));
    }
}