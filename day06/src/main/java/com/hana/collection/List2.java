package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<CustDto> list = new ArrayList();
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("James01").age(20).money(30000L).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("James02").age(20).money(30000L).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("James03").age(20).money(30000L).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id04").pwd("pwd04").name("James04").age(20).money(30000L).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id05").pwd("pwd05").name("James05").age(20).money(30000L).regdate(LocalDate.parse("2024-01-02")).build());

        list.forEach((c)->System.out.println(c));

        System.out.println("-------------------------------------------------------");

        for(CustDto c:list) {
            System.out.printf("고객정보: %s %d %,d원 %s년 %s월 %s일 %n",
                    c.getId(),
                    c.getAge(),
                    c.getMoney(),
                    c.getRegdate().getYear(),
                    c.getRegdate().getMonthValue(),
                    c.getRegdate().getDayOfMonth());
        }
        System.out.println("-------------------------------------------------------");

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy년 M월 d일");

        for(CustDto c:list){
            System.out.printf("고객정보: %s %d %,d원 %s %n",
                    c.getId(),
                    c.getAge(),
                    c.getMoney(),
                    c.getRegdate().format(formatter)
                  );
        }
    }

}
