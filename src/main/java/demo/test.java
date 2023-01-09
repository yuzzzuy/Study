package demo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;

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
//        Demotest d1 = new Demotest();
//        Demotest d2 = new Demotest();
//        d1.setId(BigDecimal.ONE);
//        d1.setName("张三");
//        d1.setSex("男");
//        d2.setId(BigDecimal.TEN);
//        d2.setName("张三");
//        d2.setSex("男");
//        String s = JSONObject.toJSONString(d1);
//        System.out.println(s);
//        JSONObject json = (JSONObject) JSONObject.parse(s);
//        System.out.println(d1.equals(d2));
//        System.out.println(d1.toString());
//        System.out.println(d2.toString());
//        String[] s = {"looks", "pest", "stew", "show"};
//        System.out.println(shortestCompletingWord("1s3 456", s));

        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        maxIncreaseKeepingSkyline(grid);


    }

//
//    public static String shortestCompletingWord(String licensePlate, String[] words) {
//        int[] cnt = getCnt(licensePlate);
//        String ans = null;
//        for (String s : words) {
//            int[] cur = getCnt(s);
//            boolean ok = true;
//            for (int i = 0; i < 26 && ok; i++) {
//                if (cnt[i] > cur[i]) ok = false;
//            }
//            if (ok && (ans == null || ans.length() > s.length())) ans = s;
//        }
//        return ans;
//    }
//
//    static int[] getCnt(String s) {
//        int[] cnt = new int[26];
//        for (char c : s.toCharArray()) {
//            if (Character.isLetter(c)) {
//                cnt[Character.toLowerCase(c) - 'a']++;
//            }
//        }
//        return cnt;
//    }


    public static void maxIncreaseKeepingSkyline(int[][] grid) {
        int[] top = new int[grid.length];
        int[] left = new int[grid[0].length];

        //


        //垂直方向天际线 和 水平方向天际线
        for (int i = 0; i < grid.length; i++) {
            int leftMax = 0;
            int topMax = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (leftMax < grid[i][j]) {
                    leftMax = grid[i][j];
                }
                if (topMax < grid[j][i]) {
                    topMax = grid[j][i];
                }

            }
            top[i] = topMax;
            left[i] = leftMax;
        }

        //建筑提高
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int nowHigh = grid[i][j];
                int topMax = top[j];
                int leftMax = left[i];
                System.out.println("now:"+nowHigh+" "+topMax+" "+leftMax +" "+ result);
                if (nowHigh < topMax || nowHigh < leftMax) {
                    result += topMax > leftMax ? leftMax - nowHigh : topMax - nowHigh;
                }
            }

        }

    }
}

