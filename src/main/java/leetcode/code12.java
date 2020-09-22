package leetcode;

/**
 * @author WangChen
 * @filename code12
 * @date 2020/9/21 17:48
 * @description 整数转罗马数字
 */

/**
 * 罗马数字包含以下七种字符：I，V，X，L，C，D和M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1到 3999 的范围内。
 * <p>
 * 示例1:
 * <p>
 * 输入:3
 * 输出: "III"
 * 示例2:
 * <p>
 * 输入:4
 * 输出: "IV"
 * 示例3:
 * <p>
 * 输入:9
 * 输出: "IX"
 * 示例4:
 * <p>
 * 输入:58
 * 输出: "LVIII"
 * 解释: L = 50, V = 5, III = 3.
 * 示例5:
 * <p>
 * 输入:1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-to-roman
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class code12 {

    public static String intToRoman(int num) {
        StringBuilder r = new StringBuilder();
        int M = num / 1000;
        num %= 1000;
        while (M-- > 0) {
            r.append('M');
        }
        int D = num / 500;
        num %= 500;
        while (D-- > 0) {
            r.append('D');
        }
        int C = num / 100;
        num %= 100;
        while (C-- > 0) {
            r.append('C');
        }
        int L = num / 50;
        num %= 50;
        while (L-- > 0) {
            r.append('L');
        }
        int X = num / 10;
        num %= 10;
        while (X-- > 0) {
            r.append('X');
        }
        int V = num / 5;
        num %= 5;
        while (V-- > 0) {
            r.append('V');
        }
        int I = num;
        while (I-- > 0) {
            r.append('I');
        }
        int i = 0;
        i = r.indexOf("DCCCC");
        if (i != -1) {
            r.replace(i, i + 5, "CM");
        }
        i = r.indexOf("CCCC");
        if (i != -1) {
            r.replace(i, i + 4, "CD");
        }
        i = r.indexOf("LXXXX");
        if (i != -1) {
            r.replace(i, i + 5, "XC");
        }
        i = r.indexOf("XXXX");
        if (i != -1) {
            r.replace(i, i + 4, "XL");
        }
        i = r.indexOf("VIIII");
        if (i != -1) {
            r.replace(i, i + 5, "IX");
        }
        i = r.indexOf("IIII");
        if (i != -1) {
            r.replace(i, i + 4, "IV");
        }
        return r.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(314));

    }
}
