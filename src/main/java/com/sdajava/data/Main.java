package com.sdajava.data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate localeData = LocalDate.now();

        LocalTime time = LocalTime.now();

        System.out.println(time);

        LocalTime teenClock = LocalTime.parse("10:00")
                .plus(12, ChronoUnit.HOURS);
        System.out.println(teenClock.toString());

        int eight = LocalTime.parse("20:21").getHour();
        System.out.println(eight);

        //ZoneId zoneId = ZoneId.of("Europa/Madrit");

        Set<String > allZones = ZoneId.getAvailableZoneIds();
        allZones.forEach(System.out::println);

    }
}
