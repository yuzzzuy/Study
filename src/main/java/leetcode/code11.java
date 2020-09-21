package leetcode;

/**
 * @author WangChen
 * @filename code12
 * @date 2020/9/21 16:36
 * @description
 */

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的至少为 2。
 * <p>
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 */
public class code11 {
    private static int area = 0;


    public static int maxArea(int[] height) {
        for (int i = 0; i < height.length; i++) {
            //System.out.println("i的值：" + i);
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[j], height[i]);
                //System.out.println("高是：" + h);
                int w = Math.abs(i - j);
                //System.out.println("宽是：" + w);
                int newarea = h * w;

                if (area < newarea) {
                    //System.out.println("面积最大：" + newarea);
                    area = newarea;

                }
                //System.out.println("j的值：" + j);
                //System.out.println("~~~~~~~~~~~~~~~~");
            }
            //System.out.println("Area的值：" + area);
            //System.out.println("~~~~~~~~~~~~~~~~");
        }
        return area;
    }

    //双指针法
    public static int maxArea1(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int h = 0;
        int area = 0;
        while (i != j) {
            h = Math.min(height[i], height[j]);
            area = Math.max(area, h * (j - i));
            if (height[i] > height[j]) {
                do {
                    j--;
                } while (j != i && height[j] < h);
            } else {
                do {
                    i++;
                } while (j != i && height[i] < h);
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea1(nums));
    }
}
