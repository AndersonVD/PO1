package Aulas.datetimes;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateNew {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {

            Calendar calendario = Calendar.getInstance();
            // calendario.set(Calendar.DAY_OF_MONTH, 24);
            // calendario.set(Calendar.MONTH, 3);
            // calendario.set(Calendar.YEAR, 1978);
            // calendario.set(Calendar.HOUR_OF_DAY, 13);
            // calendario.set(Calendar.MINUTE, 30);
            // calendario.set(Calendar.SECOND, 55);
            Date dt = calendario.getTime();
            System.out.println("Rodi " + dt);

            LocalDate dt2 = LocalDate.now();
            System.out.println(dt2);

            LocalDateTime dt3 = LocalDateTime.now();
            System.out.println(dt3);

            Instant dt4 = Instant.now();
            System.out.println(dt4);

            LocalDate dt5 = LocalDate.parse("1978-04-24");
            System.out.println(dt5);

            LocalDateTime dt6 = LocalDateTime.parse("1978-04-24T15:27:21");
            System.out.println(dt6);

            Instant dt7 = Instant.parse("1978-04-24T15:27:21-03:00");
            System.out.println(dt7);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dt8 = LocalDate.parse("24/04/1978", formatter);

            System.out.println(dt8);

            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDate dt9 = LocalDate.parse("24/04/1978 15:01:27", formatter2);
            System.out.println(dt9);
        }
    }
}
