package com.javaee.examples.java_8.java8_date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by krishna1bhat on 5/5/17.
 */
public class LocalTest {
    public static void main(String[] args){
        //Get the current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        //One of ISO-8601 formats
        /*
        * uuuu-MM-dd'T'HH:mm
        * uuuu-MM-dd'T'HH:mm:ss
        * uuuu-MM-dd'T'HH:mm:ss.SSS
        * uuuu-MM-dd'T'HH:mm:ss.SSSSSS
        * uuuu-MM-dd'T'HH:mm:ss.SSSSSSSSS
        */
        System.out.println("Current DateTime is: " + localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("Local date1: " + localDate);

        Month month = localDateTime.getMonth();
        int day = localDateTime.getDayOfMonth();
        int seconds = localDateTime.getSecond();

        System.out.println("Month is: " + month +", Day is: " + day +", Seconds is: " + seconds);


        LocalDateTime date2 = localDateTime.withDayOfMonth(8).withYear(2018);
        System.out.println("Date2 is: " + date2);

        //19 May 2017
        LocalDate date3 = LocalDate.of(2017, Month.MAY, 19);
        System.out.println("Date3 is: " + date3);

        //11 Hours, 5 minutes
        LocalTime date4 = LocalTime.of(11, 05);
        System.out.println("date4: " + date4);

        //parse string ...
        String dateString = "11:07:23";
        LocalTime date5 = LocalTime.parse(dateString);
        System.out.println("date5: " + date5);
    }
}
