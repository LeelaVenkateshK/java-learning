package com.kris.misc;

interface DefaultTestWithLambda {
    public int multiply(int a, int b);

    public default void square(int a) {
        System.out.println("This is a default method");
        System.out.println("Square of " + a + " is " + multiply(a, a));
    }
}

public class LambdaWithDefault {
    public static void main(String[] args) {
        DefaultTestWithLambda lambda = (x, y) -> x * y;
        lambda.square(2);
        System.out.print("lambda.multiply(2,3)" + lambda.multiply(2, 3));
    }
}