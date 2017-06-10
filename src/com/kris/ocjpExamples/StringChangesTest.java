package com.kris.ocjpExamples;

public class StringChangesTest {
    public static void main(String[] args) {
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");

        System.out.println("s1==s2 : " + (s1 == s2));   // true
        System.out.println("s1.equals(s2) : " + s1.equals(s2));// true
        System.out.println("s1==s3 : " + (s1 == s3)); // false
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true
        System.out.println("changing s2 to string 2");
        s2 = "string 2";
        System.out.println("s1==s2 : " + (s1 == s2)); // false
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); //false
    }
}