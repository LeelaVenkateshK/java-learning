package com.kris.misc;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        Calendar cal = Calendar.getInstance();
        cal.set(new Integer(year), new Integer(month), new Integer(day));
        Date date = cal.getTime();
//        System.out.println(date);
        System.out.println("before");
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }
}