package study.递归.总结;

import org.junit.jupiter.api.Test;

/**
 * @fileName: test2
 * @author: WangChen
 * @date: 2019/12/31 15:42
 * @description:
 */
public class test2 {
    @Test
    public void main() {
        int result = kthGrammar2(7, 5);
        System.out.println(result);
    }

    public int kthGrammar(int N, int K) {
        int[] lastrow = new int[1 << N];
        for (int i = 1; i < N; ++i) {
            for (int j = (1 << (i - 1)) - 1; j >= 0; --j) {
                lastrow[2 * j] = lastrow[j];
                lastrow[2 * j + 1] = 1 - lastrow[j];
            }
        }
        return lastrow[K - 1];
    }

    //递归（父变体）
    //
    public int kthGrammar1(int N, int K) {
        if (N == 1) {
            return 0;
        }
        return (~K & 1) ^ kthGrammar(N - 1, (K + 1) / 2);
    }

    //递归（翻转变体）
    public int kthGrammar2(int N, int K) {
        if (N == 1) {
            return 0;
        }
        if (K <= 1 << N - 2) {
            return kthGrammar(N - 1, K);
        }
        return kthGrammar(N - 1, K - (1 << N - 2)) ^ 1;
    }


}
