package version.jdk11;

import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author WangChen
 * @date 2022/2/15 11:02
 * @description
 */
public class HttpClientDemo {
    @SneakyThrows
    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://javastack.cn"))
                .GET()
                .build();
        HttpClient client = HttpClient.newHttpClient();

        //同步
//        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
        // 异步
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
        System.out.println("///////");
        Thread.sleep(10000);

    }
}
