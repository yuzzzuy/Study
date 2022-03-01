package demo;

/**
 * @author WangChen
 * @date 2021/12/15 10:38
 */
public class Test_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12, 1, 1};
        System.out.println(removeElement(nums, 1));
    }

    public static int removeElement(int[] nums, int val) {
        int p = 0;
        int q = 0;
        for (;p<nums.length;p++){
            if (nums[p] == val) {
                continue;
            }
            nums[q] = nums[p];
            q++;
        }
        return q;
    }
}