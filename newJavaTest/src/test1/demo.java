package test1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class demo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
    }
}
