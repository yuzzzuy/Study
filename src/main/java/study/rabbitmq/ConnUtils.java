package study.rabbitmq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author WangChen
 * @date 2022/9/27 15:32
 * @description
 */
public class ConnUtils {
    /**
     * 建立与RabbitMQ的连接
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("127.0.01");
        //端口
        factory.setPort(5672);
        //设置账号信息，用户名、密码、vhost
        factory.setVirtualHost("/study");
        factory.setUsername("study");
        factory.setPassword("hi714806");
        // 通过工厂获取连接
        Connection connection = factory.newConnection();
        return connection;
    }

}
