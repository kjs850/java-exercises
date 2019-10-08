package codetest;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Test1 {

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
////
////        int datesCount = Integer.parseInt(bufferedReader.readLine().trim());
////
////        List<String> dates = IntStream.range(0, datesCount).mapToObj(i -> {
////            try {
////                return bufferedReader.readLine();
////            } catch (IOException ex) {
////                throw new RuntimeException(ex);
////            }
////        })
////                .collect(toList());

        String[] arrDates = {"20th Oct 2052",
                "6th Jun 1933",
                "26th May 1960",
                "20th Sep 1958",
                "16th Mar 2068",
                "25th May 1912",
                "16th Dec 2018",
                "26th Dec 2061",
                "4th Nov 2030",
                "28th Jul 1963"
        };
        List<String> dates = Arrays.asList(arrDates);

        List<String> result = Result.reformatDate(dates);

//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }



}


class Result {

    /*
     * Complete the 'reformatDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> reformatDate(List<String> dates) {

       List<String> reformatDates = new ArrayList<>();
        try {
            for (String rawDate : dates) {
                //day convert
                String convertdDayDate = rawDate.replaceFirst("[a-zA-Z]{2}", "");

                //month,year convert- July(MMMM), Jul(MMM), 07(MM)
                SimpleDateFormat msdf = new SimpleDateFormat("d MMM yyyy");
                Date convertdMonthDate = msdf.parse(convertdDayDate);

                //reformat all
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String reformatDate = sdf.format(convertdMonthDate);
                System.out.println(reformatDate);

                reformatDates.add(reformatDate);
            }

        } catch (ParseException e) {
            e.printStackTrace();
            return Collections.EMPTY_LIST;
        }

       return reformatDates;

    }

}



