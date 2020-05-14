package com.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(ldt.format(DateTimeFormatter.ISO_DATE));
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
