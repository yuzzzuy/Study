package leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author WangChen
 * @filename code3
 * @date 2020/1/15 15:57
 * @description 无重复字符的最长子串
 */
public class code3 {
    @Test
    void test() {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public int lengthOfLongestSubstring(String s) {
        //子字符串
        String target = "";
        //最大长度计数器
        int num = 0;
        //当前子串长度计数器
        int t = 0;
        //防止子串无重复的计数器
        int x = 0;
        //按字符遍历字符串
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            //检查当前字符是否在子字符串中出现
            if (target.contains(c)) {
                num = Math.max(t, num);
                //重置遍历字符串位置
                i = i - t;
                //重置当前子串计数器
                t = 0;
                //重置子字符串
                target = "";
                //开始新循环
                continue;
            }
            //子字符串拼接
            target = target + c;
            //子字符串计数器增加
            t++;
            //防止子串无重复的计数器同步
            x = t;
        }
        //子串计数器与最后一个子串的计数器比较
        num = Math.max(x, num);
        return num;
    }
}
