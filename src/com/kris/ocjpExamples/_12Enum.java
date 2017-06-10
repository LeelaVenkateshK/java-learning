package com.kris.ocjpExamples;

enum Cards {CLUB, SPADE, DIAMOND, HEARTS};

public class _12Enum {
    public static void main(String[] args) {
        for(Cards cards:Cards.values())
            System.out.println(cards);
    }
}