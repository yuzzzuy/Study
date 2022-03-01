package demo;

import java.security.interfaces.RSAKey;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author WangChen
 * @date 2021/12/27 14:00
 */
public class Test_5 {

    public static void main(String[] args) {
//        age[y] <= 0.5 * age[x] + 7
//        age[y] > age[x]
//        age[y] > 100 && age[x] < 100
        int[] data = {37, 58, 116, 68, 55};
        System.out.println(numFriendRequests(data));
    }

    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int l = 0;
        int r = 0;
        int result = 0;
        for (int age : ages) {
            if (age <= 14) {
                continue;
            }
            while (ages[l] <= 0.5 * age + 7) {
                l++;
            }
            while (r + 1 < ages.length && ages[r + 1] <= age) {
                r++;
            }
            result += r - l;
        }
        return result;
    }
}
