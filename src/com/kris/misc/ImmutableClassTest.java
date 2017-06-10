package com.kris.misc;

public final class ImmutableClassTest {
    int a;

    public ImmutableClassTest(int a) {
        this.a = a;
    }

    public ImmutableClassTest() {
    }

    public static void main(String[] args) {
        ImmutableClassTest test = new ImmutableClassTest(20);
        System.out.println("before : " + test);
        test.setA(10);
        System.out.println("after : " + test);
    }

    public void setA(int a) {
        this.a = a;
    }
}
