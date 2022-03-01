package demo;

/**
 * @author WangChen
 * @date 2021/12/17 10:51
 */
public class Test_3 {

    public static void main(String[] args) {
//        System.out.println(numWaterBottles(15, 4));
        String date = "2021-01-02";
        String[] split = date.split("-");
        Integer month = new Integer(split[1]);
        Integer day = new Integer(split[2]);
        System.out.println(month +","+ day);
    }


    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            //还可以换的瓶子数量
            int a = numBottles / numExchange;
            //剩余空瓶子的数量
            int b = numBottles % numExchange;
            ans += a;
            numBottles = a + b;
        }
        return ans;
    }
}
