package com.kris.misc;

public class ImmutableClassTest {
    public static void main(String[] args) {
        ImmutableClass test = new ImmutableClass(20);
        System.out.println("before : " + test.getTestVariable());
        test.setTestVariable(10);
        System.out.println("after : " + test.getTestVariable());
    }
}

final class ImmutableClass {
    int testVariable;

    public ImmutableClass(int testVariable) {
        this.testVariable = testVariable;
    }

    public int getTestVariable() {
        return testVariable;
    }

    public void setTestVariable(int testVariable) {
        this.testVariable = testVariable;
    }
}