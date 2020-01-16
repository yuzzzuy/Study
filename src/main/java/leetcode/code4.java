package leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author WangChen
 * @filename code4
 * @date 2020/1/16 10:10
 * @description 寻找两个有序数组的中位数,
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 */
public class code4 {
    @Test
    void test() {
        int[] nums1 = {2};
        int[] nums2 = {};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer = 0;
        int a = nums1.length;
        int b = nums2.length;
        int n = a + b;
        int[] newArray = new int[n];
        //次数计数器
        int i = 0;
        //nums1计数器和nums2计数器
        int flag1 = 0;
        int flag2 = 0;
        while (i < n) {
            if (flag1 == a && flag2 < b) {
                newArray[i] = nums2[flag2];
                flag2++;
            } else if (flag2 == b && flag1 < a) {
                newArray[i] = nums1[flag1];
                flag1++;
            } else if (flag1 == a & flag2 == b) {
                break;
            } else if (flag1 < a && flag2 < b) {
                if (nums1[flag1] <= nums2[flag2]) {
                    newArray[i] = nums1[flag1];
                    flag1++;
                } else {
                    newArray[i] = nums2[flag2];
                    flag2++;
                }
            }
            i++;
        }
        if (n % 2 == 0) {
            answer = (double) (newArray[n / 2 - 1] + newArray[n / 2]) / 2;
        } else {
            answer = newArray[n / 2];
        }
        return answer;
    }
}
