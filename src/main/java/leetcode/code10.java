package leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author WangChen
 * @filename code10
 * @date 2020/1/17 15:44
 * @description 正则表达式匹配
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 * 说明:
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 */
public class code10 {
    @Test
    void test() {
        String s = "ac";
        String p = ".*c";
        System.out.println(s.matches(p));
        System.out.println(isMatch(s, p));
    }

    public boolean isMatch(String s, String p) {
        int len1 = s.length(), len2 = p.length();
        char[] chs1 = s.toCharArray(), chs2 = p.toCharArray();
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        for (int i = 0; i < chs2.length; i++) {
            if (chs2[i] == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (chs1[i] == chs2[j] || chs2[j] == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                } else if (chs2[j] == '*') {
                    if (chs2[j - 1] != chs1[i] && chs2[j - 1] != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1] || dp[i][j + 1] || dp[i + 1][j];
                    }

                }
            }
        }
        return dp[len1][len2];
    }
}
