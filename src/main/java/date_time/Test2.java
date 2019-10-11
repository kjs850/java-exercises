package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Test2 {

    public static void main(String[] args) {

        LocalDateTime localDateTime3 = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime3); //2019-10-11T11:38:07.943

        //LocalDataTime -> LocalDate
        LocalDate from = LocalDate.from(LocalDateTime.now());
        System.out.println("from = " + from);

        //LocalDate -> LocalDataTime
        LocalDateTime localDateTime = LocalDate.now().atTime(2, 30);
        System.out.println("localDateTime = " + localDateTime);


    }
}
