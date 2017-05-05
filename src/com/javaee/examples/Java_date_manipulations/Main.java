package com.javaee.examples.Java_date_manipulations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by krishna1bhat on 5/4/17.
 */
public class Main {
    public static void main(String[] args){

        //set date manually
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm:ss");

        Calendar calendar = new GregorianCalendar(2017, 04, 05, 23, 56, 13);
        System.out.println("Example1: " + sdf.format(calendar.getTime()));

        //change date
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, 06);
        calendar.set(Calendar.DAY_OF_MONTH, 23);

        System.out.println("Example2: " + sdf.format(calendar.getTime()));

        //o/p
        //Example1: 2017 05 05 23:56:13
        //Example2: 2018 07 23 23:56:13

        //add / subtract dates
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd");
        Calendar cal = new GregorianCalendar(2017, 04, 05);
        System.out.println("This Date: " + simpleDateFormat.format(cal.getTime()));

        //subtract 12 days
        cal.add(Calendar.DAY_OF_MONTH, -12);
        System.out.println("This Date (after subtracting 12): " + simpleDateFormat.format(cal.getTime()));

        //add three month
        calendar.add(Calendar.MONTH, 3);
        System.out.println("This Date (after adding 3): " + sdf.format(calendar.getTime()));

        //Date to Calendar
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateString = "05-04-2017 11:24:23";
        try {
            Date date = sdf2.parse(dateString);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(date);//set Date to Calendar....

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
