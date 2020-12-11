package demo;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;

/**
 * @author WangChen
 * @filename test
 * @date 2020/1/14 10:16
 * @description 杂乱的测试
 */
public class test {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance(Locale.SIMPLIFIED_CHINESE);
//        System.out.println(calendar.getTime());
//        Calendar calendar1 = Calendar.getInstance(Locale.ENGLISH);
//        System.out.println(calendar1.getTime());

//        String a = "sb";
//        String b = "s";
//        String c = b + "b";
//        System.out.println(a.equals(c));
//        System.out.println(a == c);
        Demotest d1 = new Demotest();
        Demotest d2 = new Demotest();
        d1.setId(BigDecimal.ONE);
        d1.setName("张三");
        d1.setSex("男");
        d2.setId(BigDecimal.TEN);
        d2.setName("张三");
        d2.setSex("男");
        String s = JSONObject.toJSONString(d1);
        System.out.println(s);
        JSONObject json = (JSONObject) JSONObject.parse(s);
        System.out.println(d1.equals(d2));
        System.out.println(d1.toString());
        System.out.println(d2.toString());

    }
}
