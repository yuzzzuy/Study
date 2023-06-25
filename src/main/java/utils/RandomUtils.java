package utils;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author WangChen
 * @date 2023/1/10 13:47
 * @description
 */
public class RandomUtils {

    public static double doubleRandom(int x){
        DecimalFormat df = new DecimalFormat("######0.00");
        return Double.parseDouble(df.format(Math.random() * x));
    }

    public static int intRandom(int x){
        int res = (int) (Math.random() * 100);
        return res*x;
    }
    public static int randomRange(int min,int max){
       return min + (int)(Math.random() * (max-min+1));
    }
}
