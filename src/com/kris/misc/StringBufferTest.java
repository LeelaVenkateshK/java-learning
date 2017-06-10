package com.kris.misc;

public class StringBufferTest {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        System.out.println("capacity : " + buffer.capacity() + "\tlength : "
                + buffer.length());
        buffer.append("Heeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        System.out.println("After appending: \ncapacity : " + buffer.capacity
                () + "\tlength : " + buffer.length());
        String s = null;
        buffer.append(s);
        System.out.println(buffer);
    }
}
