package com.hana;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Main2 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();  // 오늘의 날짜
        LocalTime now   = LocalTime.now();  // 현재 시간

        LocalDate birthDate1 = LocalDate.of(1999,12,31);  // 1999년 12월 31일
        LocalTime birthTime1 = LocalTime.of(23, 59, 59);  // 23시 59분 59초
        LocalDate birthDate2 = LocalDate.parse("1999-12-31");  // 1999년 12월 31일
        LocalTime birthTime2 = LocalTime.parse("23:59:59");    // 23시 59분 59초

        System.out.println(today);
        System.out.println(now);
        System.out.println(birthDate1);
        System.out.println(birthTime1);
        System.out.println(birthDate2);
        System.out.println(birthTime2);
    }
}