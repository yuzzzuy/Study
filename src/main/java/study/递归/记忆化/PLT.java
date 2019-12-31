package study.递归.记忆化;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @fileName: PLT
 * @author: WangChen
 * @date: 2019/12/31 10:00
 * @description: 爬楼梯
 * @假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * @每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @注意：给定 n 是一个正整数。
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 */
public class PLT {
    @Test
    void main(){
        System.out.println(climbStairs5(10));
    }

    //暴力法 ： climbStairs1(int n,int m)
    //时间复杂度：O(2^n) 树形递归的大小为 2^n2
    //空间复杂度：O(n) 递归树的深度可以达到 n
    public int climbStairs1(int n,int m) {
        if(n>m){
            return 0;
        }
        if(n == m){
            return 1;
        }
        return climbStairs1(n+1,m)+climbStairs1(n+2,m);
    }
    //记忆化递归:climbStair(int n)
    //时间复杂度：O(n) 树形递归的大小可以达到 n
    //空间复杂度：O(n) 递归树的深度可以达到 n
    public int climbStair(int n){
        int[] memo = new int[n+1];
        System.out.println(climbStairs2(0,n,memo));
        System.out.println(Arrays.toString(memo));
        return 1;
    }

    public int climbStairs2(int n,int m,int[] memo) {
        if(n>m){
            return 0;
        }
        if(n == m){
            return 1;
        }
        memo[n] = climbStairs2(n+1,m,memo)+climbStairs2(n+2,m,memo);
        return memo[n];
    }

    //动态规划
    //时间复杂度：O(n) 单循环到 n
    //空间复杂度：O(n) dp 数组用了 n 的空间
    public int climbStairs3(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //斐波那契数
    //时间复杂度：O(n) 单循环到 n，需要计算第 n 个斐波那契数
    //空间复杂度：O(1) 使用常量级空间
    public int climbStairs4(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    //Binets 方法
    //时间复杂度：O(log(n)) 遍历 log(n) 位。
    //空间复杂度：O(1) 使用常量级空间。
    public int climbStairs5(int n) {
        int[][] q = {{1, 1}, {1, 0}};
        int[][] res = pow(q, n);
        return res[0][0];
    }
    public int[][] pow(int[][] a, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, a);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }
    public int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
    }
    //斐波那契公式
    //时间复杂度：O(log(n)) pow方法将会用去 log(n)的时间。
    //空间复杂度：O(1) 使用常量级空间。
    public int climbStairs6(int n) {
        double sqrt5=Math.sqrt(5);
        double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }

}
