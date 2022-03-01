package leetcode.dailyTest;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author WangChen
 * @date 2021/12/14 10:18
 */
public class Test {
    public static void main(String[] args) {
        int[][] a = {{100, 300}, {200, 150}, {1000, 1250}, {2000, 3200}};
        System.out.println(scheduleCourse(a));
    }
    public static int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b)->a[1]-b[1]);
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b)->b-a);
        int sum = 0;
        for (int[] c : courses) {
            int d = c[0], e = c[1];
            sum += d;
            q.add(d);
            if (sum > e) sum -= q.poll();
        }
        return q.size();
    }
}
