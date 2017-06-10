package com.kris.ocjpExamples;

class _5NullCheck {
    public static void main(String[] arg) {
        String str = null;
        if (str instanceof Object)
            System.out.println("instance of Object");

        else
            System.out.println("str is not an object");
    }
}