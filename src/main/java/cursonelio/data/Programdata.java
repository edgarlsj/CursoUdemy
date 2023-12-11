package cursonelio.data;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Programdata {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-03-11");// convertendo o texto String em objeto data
        LocalDateTime d05 = LocalDateTime.parse("2023-03-11T13:10:00");// convertendo o texto String em objeto data e hora local
        Instant d06 = Instant.parse("2023-02-11T01:10:00Z");// convertendo o texto String em objeto local

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 Dia" + d04.getDayOfMonth());//obtendo do objeto o dia do data
        System.out.println("d04 Mes" + d04.getMonthValue());//obtendo do objeto o mes
        System.out.println("d04 Ano" + d04.getYear());//obtendo o ano

        System.out.println("d05 Hora" + d05.getHour());///get da hora do objeto
        System.out.println("d05 minutos" + d05.getMinute());//get do minuto

        /*LocalDate d04 = LocalDate.parse("2023-03-11");// convertendo o texto String em objeto data
        LocalDateTime d05 = LocalDateTime.parse("2023-03-11T13:10:00");// convertendo o texto String em objeto data e hora local
        Instant d06 = Instant.parse("2023-02-11T01:10:00Z");*/// convertendo o texto String em objeto local

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusYears(7);

        System.out.println("pastWeekLocalDate=  " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate=  " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime=  " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime=  " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant=  " + pastWeekInstant);
        System.out.println("nextWeekInstant=  " + nextWeekInstant);


        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);


        System.out.println(" t1 dias" + t1.toDays());
        System.out.println(" t2 dias" + t2.toDays());
        System.out.println(" t3 dias" + t3.toDays());
        System.out.println(" t4 dias" + t4.toDays());


    }
}
