package demo;

import java.util.Arrays;

/**
 * @author WangChen
 * @date 2021/12/15 10:23
 */
public class Test_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int p = 0;
        int q = 0;

        while (q < nums.length) {
            if (nums[q] != 0) {
                int target = nums[p];
                nums[p] = nums[q];
                nums[q] = target;
                p++;
            }
            q++;
        }
    }
}
