package promblem;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author WangChen
 * @filename Stream
 * @date 2020/6/18 15:26
 * @description
 */
public class Stream {
    @Test
    public static void main(String[] args) {
        List<Integer> test =List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> collect = test.stream()
                .filter(a -> a > 5 && a < 10)
                .collect(Collectors.toList());
        System.out.println(collect.toString());
        collect.forEach(System.out::println);

    }
}
