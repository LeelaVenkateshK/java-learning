package com.kris.ocjpExamples;

interface Side {
    String getSide();
}

class Head implements Side {
    public String getSide() {
        return "Head";
    }
}

class Tail extends Head {
    public String getSide() {
        return "Tail";
    }
}

class _6Coin {
    public static void main(String[] a) {
        Side side = new Head();
        Tail tail = new Tail();
        overload(side);
        overload((Object) side);
        overload(tail);
        overload((Side) tail);
    }

    public static void overload(Head side) {
        System.out.println(side.getSide());
    }

    public static void overload(Tail tail) {
        System.out.println(tail.getSide());
    }

    public static void overload(Side side) {
        System.out.println("Side");
    }

    public static void overload(Object obj) {
        System.out.println("Object");
    }
}