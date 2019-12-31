package com.example.demo.递归.记忆化;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @fileName: FBNQ
 * @author: WangChen
 * @date: 2019/12/31 9:43
 * @description: 斐波那契
 * @F(0) = 0,   F(1) = 1
 * @F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */
public class FBNQ {
    private HashMap<Integer, Integer> map = new HashMap<>();

    @Test
    public void main() {

        System.out.println(fib(30));
        System.out.println(map.toString());

    }

    public int fib(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result;
        if (n < 2) {
            result = n;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        map.put(n, result);
        return result;
    }
}
