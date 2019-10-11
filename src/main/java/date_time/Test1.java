package date_time;


import java.time.*;

//https://jeong-pro.tistory.com/163
public class Test1 {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        System.out.println("=================");

        LocalDate myDate = LocalDate.of(2019, 1, 3);
        System.out.println("myDate = " + myDate);
        System.out.println(myDate.getYear());
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getMonthValue());
        System.out.println(myDate.getDayOfMonth());

        System.out.println("=================");

        // 시간,날짜 동시에 필요할 때 사용.
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        System.out.println("=================");

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalTime myTime = LocalTime.of(13, 20, 3);
        System.out.println("myTime = " + myTime);

        System.out.println("=================");

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(ZoneId.of("UTC")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Seoul")));


    }
}
