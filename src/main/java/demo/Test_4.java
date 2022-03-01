package demo;

/**
 * @author WangChen
 * @date 2021/12/24 09:58
 */
public class Test_4 {
    public static void main(String[] args) {
        int[] apples = {1, 2, 3, 5, 2}, days = {3, 2, 1, 4, 2};
        System.out.println(eatenApples(apples, days));

    }

    public static int eatenApples(int[] apples, int[] days) {
        int n = apples.length;
        int cur = 0;
        int ans = 0;
        for (int i = 0; cur <= n-1 && apples[cur] >= 0; i++) {
            System.out.println("~~~~~~");
            System.out.println("第"+(i+1)+"天");
            while (cur<= n-1 && cur + days[cur] <= i) {
                System.out.println("苹果报废第"+(cur+1)+"天:"+apples[cur]+"个");
                apples[cur] = 0;
                if (++cur >n-1){
                    continue;
                };
            }
            ans += 1;
            apples[cur] -= 1;
            System.out.println("吃的"+(cur+1)+"天的,剩余"+apples[cur]);
            if (apples[cur] == 0) {
                cur++;
            }
        }
        return ans;
    }
}
