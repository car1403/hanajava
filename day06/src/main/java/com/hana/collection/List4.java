package com.hana.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class List4 {
    public static void main(String[] args) {
//        Set<String> setData = new HashSet<>();
//        setData.add("A");
//        setData.add("C");
//        setData.add("B");
//        setData.add("C");
//        setData.add("A");
//        System.out.println(setData);

        // 1~100까지의 랜덤한 정수 숫자를 중복 없이 10개 발생 시켜라
        Set<Integer> setData = new HashSet<>();
        Random r = new Random();
        while(setData.size() < 10){
            setData.add(r.nextInt(100)+1);
        }
        System.out.println(setData);
        setData.stream().sorted().forEach((c)->System.out.println(c));

    }

}
