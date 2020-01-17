package leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author WangChen
 * @filename code9
 * @date 2020/1/17 15:22
 * @description 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class code9 {
    @Test
    void test() {
        int i = 11;
        System.out.println(isPalindrome(i));
    }

    //转换字符串写法
    public boolean isPalindrome1(int x) {
        String s = String.valueOf(x);
        s = s.replace("", "#");
        int i = 0;
        int j = s.length() - 1;
        while (i != j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //转换
    public boolean isPalindrome(int x) {
        if (x == 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int num = 0;
        while (x > num) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return x == num || x == num / 10;
    }


}
