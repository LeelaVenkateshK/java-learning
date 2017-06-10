package com.kris.ocjpExamples;

class _26ExceptionCheck {

    public static void main(String arg[]) {
        try {
            int i = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
            return;
        } finally {
            System.out.println("finally");
        }
        System.out.print("End:");
    }
}