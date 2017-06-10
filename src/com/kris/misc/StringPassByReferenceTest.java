package com.kris.misc;

public class StringPassByReferenceTest {
    static String a = "abc";

    public static void main(String[] args) {
        String b = new String("def");
        String c = "ghi";
        change(b);
        change(StringPassByReferenceTest.a);
        change(c);
        System.out.printf("a: %s b:%s c:%s", StringPassByReferenceTest.a, b, c);
    }

    static void change(String x) {
        x = "xyz";
    }
}
