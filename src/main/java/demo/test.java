package demo;

import java.util.Calendar;
import java.util.Locale;

/**
 * @author WangChen
 * @filename test
 * @date 2020/1/14 10:16
 * @description 杂乱的测试
 */
public class test {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        System.out.println(calendar.getTime());
        Calendar calendar1 = Calendar.getInstance(Locale.ENGLISH);
        System.out.println(calendar1.getTime());
    }
}
