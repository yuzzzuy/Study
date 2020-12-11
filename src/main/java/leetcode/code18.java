package leetcode;

/**
 * @author WangChen
 * @filename code18
 * @date 2020/9/25 15:06
 * @description 四数之和
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组
 */
public class code18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        int sum = 0;
        for (int a = 0; a < length - 2; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            for (int b = a + 1; b < length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }
                int i = b + 1, j = nums.length - 1;

                while (i < j) {
                    sum = nums[a] + nums[b] + nums[i] + nums[j];
                    if (target < sum) {
                        while (i < j && nums[j] == nums[--j]) {
                            ;
                        }
                    } else if (target > sum) {
                        while (i < j && nums[i] == nums[++i]) {
                            ;
                        }
                    } else {
                        ans.add(new ArrayList<>(Arrays.asList(nums[a], nums[b], nums[i], nums[j])));
                        while (i < j && nums[i] == nums[++i]) {
                            ;
                        }
                        while (i < j && nums[j] == nums[--j]) {
                            ;
                        }
                    }
                }
            }
        }
        return ans;
    }

    @Test
    public void test() {
        int x = 2;
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums, 0).toString());

    }
}
