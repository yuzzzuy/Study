package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author WangChen
 * @filename code1
 * @date 2020/1/15 14:57
 * @description 两数相加
 */
public class code1 {
    @Test
    public void test() {
        int[] nums = {2, 0, 7, 11, 15};
        int target = 15;
        long begin = System.nanoTime();
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println((System.nanoTime() - begin) / 1000 + "ms");
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
