package org.example;

public class Main {
    public static void main(String[] args) {

        Cust c = Cust.builder().a(100).str("").build();
        System.out.println(c.getA());
    }
}