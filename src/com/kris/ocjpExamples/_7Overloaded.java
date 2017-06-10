package com.kris.ocjpExamples;

class _7Overloaded {
    public static void main(String ar[]) {
        /*long c=10;
		int b=10;
		Integer a=10;
		short d=10;*/
        // foo(a);foo(b);foo(c);foo(d);
        foo(10);
    }

    public static void foo(Integer i) {
        System.out.println("Integer");
    }

    public static void foo(short i) {
        System.out.println("short");
    }

    public static void foo(long i) {
        System.out.println("long");
    }

    public static void foo(int... i) {
        System.out.println("int");
    }
}