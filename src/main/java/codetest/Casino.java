//package codetest;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class Casino {
//
//    public int getMinRound(int minChip, int allInCount){
//        int round = 0;
//
//        if(allInCount > 0){
//            for (int i = allInCount; i > 0; i--) {
//                round ++;
//                if(minChip % 2 == 0){
//                    minChip = minChip / 2;
//                }else{
//                    minChip = minChip / 2 + 1 ;
//                }
//                System.out.println( i +" - " + minChip);
//                if(minChip / 2 ==1 ) break;
//            }
//            round= round + (minChip -1);
//
//        }else{
//            round = minChip - 1;
//        }
//
//        return round;
//
//    }
//    @Test
//    public void test(){
//        Assert.assertEquals(7, getMinRound(8, 0));
////        Assert.asserΩtEquals(6, getMinRound(18, 2));
////        Assert.assertEquals(4, getMinRound(2147483647, 10));
//        System.out.println(getMinRound(2147483647, 10));
//    }
//}
