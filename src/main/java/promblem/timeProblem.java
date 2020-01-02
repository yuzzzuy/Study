package promblem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @fileName: promblem.timeProblem
 * @author: WangChen
 * @date: 2020/1/2 9:46
 * @description:
 */
public class timeProblem {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
    // 2019-12-31
        calendar.set(2019, Calendar.DECEMBER, 31);
        Date strDate1 = calendar.getTime();
    // 2020-01-01
        calendar.set(2020, Calendar.JANUARY, 1);
        Date strDate2 = calendar.getTime();
    // 大写 YYYY
        DateFormat formatUpperCase = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println("2019-12-31 to YYYY/MM/dd: " + formatUpperCase.format(strDate1));
        System.out.println("2020-01-01 to YYYY/MM/dd: " + formatUpperCase.format(strDate2));
    // 小写 YYYY
        DateFormat formatLowerCase = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("2019-12-31 to yyyy/MM/dd: " + formatLowerCase.format(strDate1));
        System.out.println("2020-01-01 to yyyy/MM/dd: " + formatLowerCase.format(strDate2));
    }
}
