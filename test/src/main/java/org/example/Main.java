package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("Main");
        Cust c = Cust.builder().id(100).name("11").build();
        log.info("ddd");
    }
}