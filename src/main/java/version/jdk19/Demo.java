package version.jdk19;

import lombok.SneakyThrows;
import sun.misc.Unsafe;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

/**
 * @author WangChen
 * @date 2022/9/27 10:34
 * @description
 */
public class Demo {

    @SneakyThrows
    public static void main(String[] args)throws Exception {
        LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue <>(1000);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (true) {
                    queue.offer(new Object());
                    queue.remove();
                }
            }).start();
        }
        while (true) {
            System.out.println("begin scan,i still alive");
            queue.stream()
                    .anyMatch(Objects::isNull);
            Thread.sleep(100);
            System.out.println("finish scan,i still alive");
        }
    }
}
