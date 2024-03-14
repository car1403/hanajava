package com.hana.collection;

import lombok.*;

import java.time.LocalDate;
import java.util.Locale;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustDto {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private long money;
    private LocalDate regdate;
}
