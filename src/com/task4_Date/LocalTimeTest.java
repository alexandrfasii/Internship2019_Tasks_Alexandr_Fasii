package com.task4_Date;

import org.junit.Test;

import java.time.*;

public class LocalTimeTest {

    @Test
    public void flight() {
        ZonedDateTime sydneyLocal = ZonedDateTime.of(LocalDate.now(), LocalTime.of(11, 15), ZoneId.of("Australia/Sydney"));
        ZonedDateTime losAngelesLocal = ZonedDateTime.of(LocalDate.now(), LocalTime.of(6, 0), ZoneId.of("America/Los_Angeles"));
        System.out.println("The duration of the flight is: " + Duration.between(sydneyLocal, losAngelesLocal).toString().substring(2));
    }

    @Test                           //In progress...
    public void SW() {
    }
}
