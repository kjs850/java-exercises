package codetest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        //int[] posAndSpeed = {3,4,3,1,3,3,2,1};


        //4,15,15,12,18,3,8
        //2,5,3,2,3,3,2
        List<Integer> startingPos = Arrays.asList(4,15,15,12,18,3,8);
        List<Integer> speed = Arrays.asList(2,5,3,2,3,3,2);

        List<Integer> startingPos1 = Arrays.asList(4,3,1);
        List<Integer> speed1 = Arrays.asList(3,2,1);

        int protectionTime = Solution.protectionTime(startingPos, speed);

        System.out.println("protectionTime = " + protectionTime);

        int protectionTime1 = Solution.protectionTime(startingPos1, speed1);

        System.out.println("protectionTime1 = " + protectionTime1);
    }

}

class Solution{

    public static int protectionTime(List<Integer> startingPos, List<Integer> speed){
        int protectionTime = 0;
        List<Integer> currentPos = startingPos;

        while(!isOver(currentPos, speed)){
            currentPos = getCurrentPos(currentPos, speed);
            protectionTime ++;
        }
        return protectionTime;

    }

    private static boolean isOver(List<Integer> currentPos, List<Integer> speed){
        boolean allOver = currentPos.stream().allMatch(v -> v == 0);
        for (Integer cPos : currentPos) {
            if (cPos < 0 || allOver) {
                return true;
            }
        }

        return false;
    }

    private static List<Integer> getCurrentPos(List<Integer> startingPos, List<Integer> speed) {
        List<Integer> currentPos = new ArrayList<>();

        for (int i = 0; i < startingPos.size(); i++) {

            Integer pos = startingPos.get(i);
            Integer sp = speed.get(i);

            if(pos ==0){
                sp = 0;
            }
            Integer cPos = pos - sp;

            currentPos.add(cPos);
        }

        //for debug
        for (Integer cp : currentPos) {
            System.out.println(cp);
        }
        System.out.println("=======");

        return currentPos;
    }



}
