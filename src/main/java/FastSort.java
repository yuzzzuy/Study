import java.util.Arrays;

/**
 * @author WangChen
 * @date 2023/5/5 11:11
 * @description
 */
public class FastSort {

    public static void main(String[] args) {
        int[] i = {124, 5, 2, 32, 56, 7, 9, 7, 54, 100};
        fast(i, 0, i.length - 1);
        System.out.println(Arrays.toString(i));
    }

    private static void fast(int[] org, int left, int right) {
        int l = left;
        int r = right;
        if (left >= right) {
            return;
        }
        int pivot = org[left];
        int temp = 0;
        while (l < r) {
            while (pivot <= org[r] && l < r) {
                r--;
            }
            while (pivot >= org[l] && l < r) {
                l++;
            }
            if (l < r) {
                temp = org[r];
                org[r] = org[l];
                org[l] = temp;
            }
        }
        org[left] = org[l];
        org[l] = pivot;
        fast(org, left, l - 1);
        fast(org, l + 1, right);


    }
}
