package com.kris.misc;

public class FinalStaticVariableTest {
    public static int finalVar2;
    public final int finalVar;

    FinalStaticVariableTest() {
        finalVar = 1;
    }

    public static void main(String a[]) {
        FinalStaticVariableTest testVar = new FinalStaticVariableTest();
        System.out.print(FinalStaticVariableTest.finalVar2 + testVar.finalVar);
        // testVar.setFinalVar(3);
    }
}