package com.javaee.examples.java_8.java8_date_time_api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by krishna1bhat on 5/5/17.
 */
public class PeriodNDurationTest {
    public static void main(String[] args){
        PeriodNDurationTest periodNDurationTest = new PeriodNDurationTest();
        periodNDurationTest.testPeriod();
        periodNDurationTest.testDuration();
    }

    public void testPeriod(){
        System.out.println("Period − Deals with DATE based amount of time:");

        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //add 1 month to the current date
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + date2);

        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);
    }

    public void testDuration(){
        System.out.println("\nDuration − Deals with TIME based amount of time:");

        LocalTime time1 = LocalTime.now();
        Duration threeHours = Duration.ofHours(3);

        LocalTime time2 = time1.plus(threeHours);
        Duration duration = Duration.between(time1, time2);
        System.out.println("Duration : " + duration);
    }
}
