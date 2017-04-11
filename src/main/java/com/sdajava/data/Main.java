package com.sdajava.data;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate localeData = LocalDate.now();

        LocalTime time = LocalTime.now();

        System.out.println(time);

        LocalTime teenClock = LocalTime.parse("10:00");
        System.out.println(teenClock.toString());

    }
}
