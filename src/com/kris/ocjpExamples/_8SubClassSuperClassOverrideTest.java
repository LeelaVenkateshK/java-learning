package com.kris.ocjpExamples;

class Base {
    public static void foo(Base b) {
        System.out.println("in Base Foo()");
        b.bar();
    }

    public void bar() {
        System.out.println("IN Base bar()");
    }
}

class Derived extends Base {
    public static void foo(Base b) {
        System.out.println("in Derived Foo()");
        b.bar();
    }

    public void bar() {
        System.out.println("IN Derived bar()");
    }
}

class _8SubClassSuperClassOverrideTest {
    public static void main(String ar[]) {
        Base derived = new Derived();
        derived.foo(derived);
        // Base.foo(derived);
    }
}