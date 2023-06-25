package se.demo;

import cn.hutool.core.util.ReflectUtil;
import org.apache.poi.util.StringUtil;

/**
 * @author WangChen
 * @filename Test
 * @date 2020/12/11 15:14
 * @description
 */
public class Test {

    public static void main(String[] args) {
//        String test = "head test.txt";
//        StringBuilder sb = new StringBuilder(test);
//
//        System.out.println(isFlipedString(test, sb.reverse().toString()));

        String str1 = "Hello\u0020World!";
        String str2 = "Hello World!";



        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int n = s1.length();
        if (n == 0)
            return true;
        for (int i = 0; i < n; i++) {
            boolean res = true;
            for (int j = 0; j < n; j++) {
                if (s1.charAt((i + j) % n) != s2.charAt(j)) {
                    res = false;
                    break;
                }
            }
            if (res) {
                return true;
            }
        }
        return false;
    }
}
