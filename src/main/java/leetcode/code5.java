package leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author WangChen
 * @filename code5
 * @date 2020/1/16 15:31
 * @description 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */
public class code5 {
    @Test
    void test() {
        String s = "abacdcfg";
        System.out.println(longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        String answer = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String test = s.substring(i, j);
                if (isisPalindromic(test) && max < test.length()) {
                    answer = test;
                    max = test.length();
                }
            }
        }
        return answer;
    }

    public boolean isisPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
