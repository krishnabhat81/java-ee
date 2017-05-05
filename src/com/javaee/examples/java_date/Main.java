package com.javaee.examples.java_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by krishna1bhat on 5/4/17.
 */

//Date API
//java.util.Date
public class Main {
    public static void main(String[] args){
        // 1. Convert Date to String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy");
        String date = simpleDateFormat.format(new Date()); // new Date() returns System.currentTimeMillis()
        System.out.println(date);   //04/5/2017

        // 2. Convert String to Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateString = "04-05-2017 23:13:56";
        try {
            Date date1 = sdf.parse(dateString);
            System.out.println(date1); //Thu May 04 23:13:56 EDT 2017
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 3. Get current date time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date2 = new Date();
        System.out.println(dateFormat.format(date2)); //2017/05/04 23:22:30

        // 4. Calender to Date Conversion
        Calendar calendar = Calendar.getInstance();
        Date calDate = calendar.getTime();
        System.out.println(dateFormat.format(calDate)); //2017/05/04 23:22:30
    }
}
