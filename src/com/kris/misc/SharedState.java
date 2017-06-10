package com.kris.misc;

import java.util.ArrayList;
import java.util.List;

public class SharedState {
    private static final List<SharedState> list = new ArrayList<>();

    public SharedState() {
        list.add(this); // What does "this" mean here?
        System.out.println(list);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                new SharedState();
            }
        };
        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                new SharedState();
            }
        };
        t1.start();
        //System.out.println(SharedState.list);
        t2.start();
    }

    @Override
    public String toString() {
        return "SharedSate";
    }
}