package com.kris.ocjpExamples;

class _2Point2D {
    private int x, y;

    public _2Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] a) {
        _2Point2D point = new _2Point2D(10, 20);
        System.out.print(point);
    }

    public String toString() {
        return ("[" + this.x + "," + this.y + "]");
    }
}