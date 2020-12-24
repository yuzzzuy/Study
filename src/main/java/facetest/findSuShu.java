package facetest;

import java.util.Arrays;

/**
 * @author WangChen
 * @filename findSuShu
 * @date 2020/9/30 10:18
 * @description 找质数
 */
public class findSuShu {
    public static void main(String[] args) {
        System.out.println(isPrime(1193));
        System.out.println(fastpow(2, 8));
        int[][] m = {{4, 5, 6, 8}, {6, 2, 7, 3}, {6, 8, 2, 8}, {1, 6, 7, 3}};
        int[] b = print(m);
        System.out.println(Arrays.toString(b));
    }

    public static boolean isPrime(int n) {
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        for (int i = 2; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double pow(int x, int y) {
        if (y < 0) {
            x = 1 / x;
            y = -y;
        }
        return fastpow(x, y);
    }

    private static double fastpow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        double result = fastpow(x, y / 2);
        if (y % 2 == 0) {
            return result * result;
        } else {
            return result * result * x;
        }
    }

    public static int[] print(int[][] a) {
        int t = 0;
        int f = a.length - 1;
        int l = 0;
        int r = a[0].length - 1;
        int x = 0;
        int[] res = new int[(r + 1) * (f + 1)];
        while (true) {
            for (int i = l; i <= r; i++) {
                res[x++] = a[t][i];
            }
            if (++t > f) {
                break;
            }
            for (int i = t; i <= f; i++) {
                res[x++] = a[i][r];
            }
            if (l > --r) {
                break;
            }
            for (int i = r; i >= l; i--) {
                res[x++] = a[f][i];
            }
            if (t > f--) {
                break;
            }
            for (int i = f; i >= t; i--) {
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
