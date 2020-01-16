package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangChen
 * @filename code6
 * @date 2020/1/16 16:10
 * @description Z 字形变换
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * 请你实现这个将字符串进行指定行数变换的函数：
 * string convert(string s, int numRows);
 */
public class code6 {
    @Test
    void test() {
        String s = "asdnuewiqhhqwid";
        System.out.println(convert(s, 3));
    }

    //大佬的解法 模拟Z字走法(不考虑还原原字符串)
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        //按行建立字符串（一行为一个字符串->不考虑空格 因为最后输出空格忽略的）
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            //灵性用flag 控制行的变化 0 ->1->2->1->0->.....
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        //拼接字符串
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}

