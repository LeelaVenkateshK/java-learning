package com.kris.ocjpExamples;

class SimpleCounter<T> {
    public static int count = 0;

    public SimpleCounter() {
        count++;
    }

    static int getCount() {
        return count;
    }
}

class _20CounterTest {

    public static void main(String arg[]) {
        SimpleCounter<Double> doubleCounter = new SimpleCounter<Double>();
        SimpleCounter<Integer> intCounter = null;
        SimpleCounter rawCounter = new SimpleCounter();
        System.out.println("SimpleCounter<Double> count : " + doubleCounter
                .getCount());
        System.out.println("SimpleCounter<Integerr> count : " + intCounter
                .getCount());
        System.out.println("SimpleCounter<raw> count : " + rawCounter.getCount());
    }
}