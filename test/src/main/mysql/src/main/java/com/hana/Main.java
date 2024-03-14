package com.hana;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String name = "James";
        LocalDate lodate = LocalDate.of(2024, 3, 11);
        int price = 10000;
        System.out.printf("%s 날짜, 이름 %s,  %,d원%n", lodate, name, price);//3자리 단위로 쉼표 표시


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
        String nowString = lodate.format(dateTimeFormatter);
        System.out.println(nowString);

        System.out.printf("%s 날짜, 이름 %s,  %,d원%n", nowString, name, price);//3자리 단위로 쉼표 표시

    }
}