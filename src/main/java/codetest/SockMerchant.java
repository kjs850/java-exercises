package codetest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class SockMerchant {

    public static void main(String[] args) {

        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};


        Set<Integer> arSet = Arrays.stream(ar).boxed().collect(Collectors.toSet());
        System.out.println(arSet);

        System.out.println("====");

        Long pair = 0L;
            List<Integer> intList = Arrays.stream(ar).boxed().collect(Collectors.toList());
            Map<Integer, Long> countByNum =
                    intList.stream().collect(groupingBy(Integer::intValue, counting()));

            System.out.println(countByNum);

            for( Integer key : countByNum.keySet() ){
                System.out.println( String.format("키 : %s, 값 : %s", key, countByNum.get(key)) );
                System.out.println((countByNum.get(key) / 2));

                pair = pair + (countByNum.get(key) / 2);
            }

        pair.intValue();

    }
}
