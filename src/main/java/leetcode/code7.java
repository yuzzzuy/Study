package leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author WangChen
 * @filename code7
 * @date 2020/1/16 16:55
 * @description 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class code7 {
    @Test
    void test() {
        int i = 154646;
        System.out.println(reverse(i));
    }

    public int reverse(int x) {
        int result;
        int temp = x;
        String temp_result = "";
        try {
            if (temp > 0) {
                while (temp / 10 >= 0 && temp != 0) {
                    temp_result += (temp % 10);
                    temp /= 10;
                }
                result = Integer.parseInt(temp_result);
            } else {
                temp = Math.abs(x);
                while (temp / 10 >= 0 && temp != 0) {
                    temp_result += (temp % 10);
                    temp /= 10;
                }
                result = -Integer.parseInt(temp_result);
            }
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }
}
