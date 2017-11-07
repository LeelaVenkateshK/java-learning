package com.kris.misc;

public class MultipleInterfaceImpl
        extends AbstractClassExample implements TestInterfaceOne, TestInterfaceTwo {
    public int getTestValue() {
        return 1;
    }

    public long getTestValue() {
        return 1L;
    }

    public double getTestValue() {
        return 1.0;
    }

    public static void main(String[] args) {
        System.out.println("Testing");
        MultipleInterfaceImpl test = new MultipleInterfaceImpl();
    }
}

interface TestInterfaceOne {
    long getTestValue();
}

interface TestInterfaceTwo {
    int getTestValue();
}

abstract class AbstractClassExample {
    abstract double getTestValue();
}