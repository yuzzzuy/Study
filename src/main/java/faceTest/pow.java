package faceTest;

/**
 * @author WangChen
 * @filename pow
 * @date 2020/9/30 10:18
 * @description X的Y次方
 */
public class pow {


    public static void main(String[] args) {
        System.out.println(pow(-2, -4));
        System.out.println(pow1(-2, -4));

    }

    //暴力破解 递归
    public static double pow(double x, int y) {
        //0的n次幂永远为0
        if (x == 0) {
            return 0;
        }
        //递归出口和特殊判断
        if (x == 1 || y == 0) {
            return 1;
        }
        //指数大于0和小于0的判断
        if (y < 0) {
            x = 1 / x;
            y = -y;
        }
        return x * pow(x, y - 1);
    }

    // 快速幂
    public static double pow1(double x, int y) {
        //指数大于0和小于0的判断
        if (y < 0) {
            x = 1 / x;
            y = -y;
        }
        return fastPow(x, y);
    }

    public static double fastPow(double x, int y) {
        if (y == 0) {
            return 1;
        }
        double result = fastPow(x, y / 2);
        if (y % 2 == 0) {
            return result * result;
        } else {
            return result * result * x;
        }
    }
    

}
