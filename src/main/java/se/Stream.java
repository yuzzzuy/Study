package se;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author WangChen
 * @filename Stream
 * @date 2020/12/11 16:18
 * @description
 */
public class Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ddd2");
        list.add("aaa2");
        list.add("bbb1");
        list.add("aaa1");
        list.add("bbb3");
        list.add("ccc");
        list.add("bbb2");
        list.add("ddd1");

        //过滤
        list.stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        //排序
        list.stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        //映射
        list.stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);
        //匹配
        boolean anyStartsWithA = list.stream()
                .anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA);

        boolean allStartsWithA = list.stream()
                .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);

        boolean noneStartsWithZ = list.stream()
                .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);
        //计数
        long startsWithB = list.stream()
                .filter((s) -> s.startsWith("b"))
                .count();
        System.out.println(startsWithB);

        //规约
        Optional<String> reduced = list.stream()
                .sorted()
                .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

    }
}
