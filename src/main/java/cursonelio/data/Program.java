package cursonelio.data;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        int year = 2023;
        int mounth = 11;
        int day = 02;
        int minute = 37;
        int hour = 8;

        LocalDate d01 = LocalDate.now(); //data
        LocalDateTime d02 = LocalDateTime.now();//data e hora local
        Instant d03 = Instant.now(); // Data hora global
        LocalDate d04 = LocalDate.parse("2023-11-03"); // instanciar e formatar data em objeto
        LocalDateTime d05 = LocalDateTime.parse("2023-01-02T08:30:26");//instanciar e formatar data e hora em objeto
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");// instanciar e formatar em hora global (zulu)
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//instanciar e formatar em hora global GMT


        LocalDate d08 = LocalDate.parse("02/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("02/11/2023 08:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(year, mounth, day); //converter numeros inteiros em objeto do tipo Data.
        LocalDateTime d11 = LocalDateTime.of(year, mounth, day, hour, minute);



        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);


        System.out.println("---------------------Convertendo Data/Hora em Texto--------------------------------");
        System.out.println();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formatando a data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//especifica a zona para instant global
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;



        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + fmt3.format(d06));










        sc.close();
    }


}
