package com.kris.ocjpExamples;

interface Birdie {
    public void fly() throws CannotFlyException;
}

interface Biped {
    public void walk();
}

class CannotFlyException extends Exception {
}

abstract class NonFlyer {
    public void fly() {
        System.out.println("cannot fly");
    }
}

class Penguin extends NonFlyer implements Birdie, Biped {
    public void walk() {
        System.out.println("walk");
    }
}

class _9PenguinTest {
    public static void main(String[] a) {
        Penguin pingu = new Penguin();
        pingu.walk();
        pingu.fly();
    }
}