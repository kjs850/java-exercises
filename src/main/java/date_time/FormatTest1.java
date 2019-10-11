package date_time;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//https://jeong-pro.tistory.com/163
public class FormatTest1 {

    public static void main(String[] args) {
        String format = LocalDate.of(2020, 12, 12).format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("format = " + format);

        String format1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("format1 = " + format1);
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));

        //LocalDate -> java.sql.Date
        Date date = Date.valueOf(LocalDate.now());
        System.out.println("date = " + date);

        //LocalDateTime -> java.sql.Timestamp
        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
        System.out.println("timestamp = " + timestamp);

        System.out.println("==================");

        //String -> LocalDate
        LocalDate parse = LocalDate.parse("2002-05-09");
        System.out.println("parse = " + parse);
        LocalDate parse1 = LocalDate.parse("20081004", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("parse1 = " + parse1);

        //String -> LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse("2007-12-03T10:15:30");
        System.out.println("localDateTime = " + localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.parse("2010-11-25 12:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("localDateTime2 = " + localDateTime2);




    }
}
