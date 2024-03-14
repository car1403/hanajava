package com.hana.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.toString());

        for(String s:list){
            System.out.println(s);
        }
        list.stream().forEach((s)->System.out.println(s));

        list.remove("B");
        list.stream().forEach((s)->System.out.println(s));

        list.add("D");
        list.add("E");

        System.out.println(list.indexOf("A"));

        String result = list.get(list.indexOf("A"));
        System.out.println(result);


    }

}
