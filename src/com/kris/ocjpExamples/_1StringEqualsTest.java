package com.kris.ocjpExamples;

class _1StringEqualsTest {

    public static void main(String args[]) {
        String s1 = "Kris";
        String s2 = new String("Kris");
        String s3 = "Kris";

        System.out.println("s1==s2::" + (s1 == s2));
        System.out.println("s1.equals(s2)::" + s1.equals(s2));
        System.out.println("s1==s3::" + (s1 == s3));
        System.out.println("s2==s3::" + s2 == s3);
    }
}