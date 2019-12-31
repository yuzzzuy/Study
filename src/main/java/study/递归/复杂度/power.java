package study.递归.复杂度;

import org.junit.jupiter.api.Test;

/**
 * @fileName: power
 * @author: WangChen
 * @date: 2019/12/31 11:29
 * @description: 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 */
public class power {
    @Test
    public  void main() {
        System.out.println(myPow(2,5));
    }
    public double myPow(double x, int n) {
        long f = n;
        double result = 1;
        if (f < 0){
            x = 1/x;
            f = -f;
        }
        for (int j = 0 ; j < n ; j ++){
            result = result*x;
        }
        return result;
    }
}
