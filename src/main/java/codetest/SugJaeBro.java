package codetest;

import org.junit.Test;

import java.util.*;

public class SugJaeBro {

    static List<Integer> reassignedPriorities(List<Integer> issuePriorities) {
        List<Integer> resultPriorities = new ArrayList<Integer>();
        Set orderSet = new HashSet();

        for (int i = 1; i < issuePriorities.size(); i++) {
            orderSet.add(issuePriorities.get(i));
        }

        Integer[] orderList = (Integer[]) orderSet.toArray(new Integer[orderSet.size()]);
        int index = 0;
        for (int i = 1; i < issuePriorities.size(); i++) { // 초기 제출 답안은 int i=1;로 수행 T/C에서 수행 결과 오류 발생이고, 디버깅중 이상한 내용 확인.
            //i=1로 할 경우 input size가 5개일 때 결과 Array의 사이즈가 4개가 나와야 정상인데, hackrank에서 수행 결과로 3개의 사이즈가 나옴.
            // 실행 output이 로컬에서 실행했을 때와 배열의 크기가 달라 i=0으로 임시 수정하여 실행. (14/15 TC 통과)
            index = Arrays.binarySearch(orderList, issuePriorities.get(i));
            resultPriorities.add((1 + index));
            // 해당 소스를 동일하게 실행 했을 때 Local에서의 실행결과와 다릅니다. 확인부탁드립니다.
        }
        return resultPriorities;

    }

    @Test
    public void test(){
        List<Integer> integers = Arrays.asList(4, 1, 3, 7, 3);
//        List<Integer> integers = Arrays.asList(4, 1, 3, 7);
        List<Integer> result = reassignedPriorities(integers);

        result.forEach(System.out::println);
        // 1, 2, 3, 2 맞는거
        // 0,1,2,1 이게 틀린거
    }
}
