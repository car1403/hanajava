package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear());
        System.out.println(d.getMonth());

        System.out.println("-------------------------------------------------");

        LocalDate localNow = LocalDate.now();
        System.out.println(localNow);
        LocalDate localDate1 = LocalDate.of(2024,3,14);
        LocalDate localDate2 = LocalDate.parse("2024-03-14");
        System.out.println(localDate1);
        System.out.println(localDate2);

        System.out.println("-------------------------------------------------");

        LocalDateTime localTimeNow = LocalDateTime.now();
        LocalDateTime localTime1 =
                LocalDateTime.of(2024,03,11,11,11,11);
        LocalDateTime localTime2 =
                LocalDateTime.parse("2024-03-11T11:11:11");

        System.out.println(localTimeNow);
        System.out.println(localTime1);
        System.out.println(localTime2);


    }

}
