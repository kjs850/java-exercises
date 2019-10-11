//package codetest;
//
//import org.junit.*;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//public class ArrCompare {
//
//    // Complete the compareTriplets function below.
//    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
//        List<Integer> result = new ArrayList<>();
//        int aSize = a.size();
//        int bSize = b.size();
//        int aWin = 0;
//        int bWin = 0;
//        if(aSize == bSize) {
//            for (int i = 0; i < aSize; i++) {
//                if (a.get(i) > b.get(i)) aWin++;
//                if (a.get(i) < b.get(i)) bWin++;
//            }
//        }
//        result.add(aWin);
//        result.add(bWin);
//
//        return result;
//    }
//
//    @Test
//    public void test(){
//
//        List<Integer> a = new ArrayList<>();
//        a.add(20);
//        a.add(10);
//        a.add(50);
//
//
//        List<Integer> b = new ArrayList<>();
//        b.add(10);
//        b.add(10);
//        b.add(100);
//
//        List<Integer> result = compareTriplets(a, b);
//
//        String s = result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//                + "\n";
//
//        System.out.println(s);
//    }
//
//    public static void main(String[] args) throws IOException {
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter());
////
////        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
////                .map(Integer::parseInt)
////                .collect(toList());
////
////        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
////                .map(Integer::parseInt)
////                .collect(toList());
////
////        List<Integer> result = compareTriplets(a, b);
////
////        bufferedWriter.write(
////                result.stream()
////                        .map(Object::toString)
////                        .collect(joining(" "))
////                        + "\n"
////        );
////
////        bufferedReader.close();
////        bufferedWriter.close();
//    }
//}
