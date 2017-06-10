package com.kris.ocjpExamples;

class _3Increment {

    public static void main(String[] ar) {
        Integer a = 10;
        Integer b = 11;
        Integer c = ++a;
        System.out.println("b==c        :: " + (b == c));
        System.out.println("b.equals(c) :: " + b.equals(c));
    }
}