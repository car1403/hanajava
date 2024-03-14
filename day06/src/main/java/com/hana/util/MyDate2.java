package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class MyDate2 {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate =
                date.toInstant().atZone(ZoneId.of("Asia/Seoul")).toLocalDate();
        System.out.println(localDate);

        LocalDateTime localDatetime =
                date.toInstant().atZone(ZoneId.of("Asia/Seoul")).toLocalDateTime();

        System.out.println(localDate);
        System.out.println(localDatetime);
    }

}
