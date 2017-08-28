package com.javaee.examples.java_8.java8_date_time_api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by krishna1bhat on 5/5/17.
 */

//When time zone is to be considered, we use Zoned date-time API.
public class ZonedTest {
    public static void main(String[] args){
        // Get the current date and time
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2017-04-05T12:55:23+05:45[Asia/Kathmandu]");
        System.out.println("Date1 : " + zonedDateTime);

        ZoneId zoneId = ZoneId.of("Asia/Kathmandu");
        System.out.println("ZoneId : " + zoneId);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone : " + currentZone);

    }
}
