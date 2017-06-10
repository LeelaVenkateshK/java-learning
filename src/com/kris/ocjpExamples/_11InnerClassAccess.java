package com.kris.ocjpExamples;

class _11InnerClassAccess {
    public static void main(String arg[]) {
        System.out.println(new OuterClass.InnerClass().text);
    }
}

class OuterClass {
    static class InnerClass {
        public final String text = "Inner";
    }
}