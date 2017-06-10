package com.kris.misc;

interface DefaultTest {
    int multiply(int a, int b);

    default void square(int a) {
        System.out.println("This is a default method");
        System.out.println(multiply(a, a));
    }
}

public class DefaultTesterClass implements DefaultTest {
    public static void main(String[] ar) {
        DefaultTesterClass def = new DefaultTesterClass();
        def.square(10);
        System.out.println(def.multiply(10, 2));
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    public void square(int a) {
        System.out.println("not in default method");
    }
}