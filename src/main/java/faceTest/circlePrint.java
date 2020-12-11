package faceTest;

import java.util.Arrays;

/**
 * @author WangChen
 * @filename circlePrint
 * @date 2020/9/30 15:51
 * @description 循环打印矩阵
 */
public class circlePrint {
    public static void main(String[] args) {
        int[][] m = {{4, 5, 6, 8}, {6, 2, 7, 3}, {6, 8, 2, 8}, {1, 6, 7, 3}};
        int[] b = print(m);
        System.out.println(Arrays.toString(b));
    }
    public static int[] print(int[][] a) {
        if (a.length == 0) {
            return new int[0];
        }
        int l = 0;
        int t = 0;
        int r = a[0].length - 1;
        int b = a.length - 1;
        int x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
            // 0->右边界
            for (int i = l; i <= r; i++) {
                res[x++] = a[t][i];
            }
            //判断上边界是否会移动到下边界
            if (++t > b) {
                break;
            }
            //上边界->下边界
            for (int i = t; i <= b; i++) {
                res[x++] = a[i][r];
            }
            //判断左边界是否在有边界旁
            if (l > --r) {
                break;
            }
            //右边界->左边界
            for (int i = r; i >= l; i--) {
                res[x++] = a[b][i];
            }
            //判断下边界是否在上边界边上
            if (t > --b) {
                break;
            }
            //下边界->上边界
            for (int i = b; i >= t; i--) {
                res[x++] = a[i][l];
            }
            //判断左边界是否在右边界旁边
            if (++l > r) {
                break;
            }
        }
        return res;

    }

}

