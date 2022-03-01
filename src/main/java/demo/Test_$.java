package demo;

import java.util.Arrays;

/**
 * @author WangChen
 * @date 2021/12/21 10:11
 */
public class Test_$ {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2003-03-01"));
    }

    public static int dayOfYear(String date) {
        String[] split = date.split("-");
        Integer year = new Integer(split[0]);
        int month = new Integer(split[1]);
        int day = new Integer(split[2]);
        Integer[] bigMonth = {1,3,5,7,8,10,12};
        Integer[] midMonth = {4,6,9,11};
        int ans = 0;
        for (int i = 1;i<=month;i++ ){
            if (i == month){
                ans += day;
            }else {
                if (Arrays.asList(bigMonth).contains(i)){
                    ans+= 31;
                }else {
                    if (Arrays.asList(midMonth).contains(i)){
                        ans +=30;
                    }else if(isYear(year)){
                        ans +=29;
                    }else {
                        ans +=28;
                    }
                }
            }
        }
        return ans;
    }

    public static boolean isYear(Integer year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
