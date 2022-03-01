package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author WangChen
 * @date 2021/12/27 10:51
 */
public class DateTime {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Integer month = 0;
        Integer day = 26;
        Calendar beginTime = Calendar.getInstance();
        beginTime.add(Calendar.MONTH, month);
        beginTime.set(Calendar.DAY_OF_MONTH, day);
        setHourAndMinuteAndSecond2Zero(beginTime);
        Calendar endTime = Calendar.getInstance();
        endTime.add(Calendar.MONTH, month);
        endTime.set(Calendar.DAY_OF_MONTH, day + 1);
        setHourAndMinuteAndSecond2Zero(endTime);
        System.out.println("导入数据开始时间为:" + sdf.format(beginTime.getTime()));
        System.out.println("导入数据结束时间为:" + sdf.format(endTime.getTime()));
        System.out.println(Long.parseLong(sdf.format(beginTime.getTime()).concat("00000000")));
        System.out.println(Long.parseLong(sdf.format(beginTime.getTime()).concat("64000000")));

    }

    public static Calendar setHourAndMinuteAndSecond2Zero(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

}
