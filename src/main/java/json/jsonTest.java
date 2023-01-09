package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Assertions;
import utils.JsonUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * @author WangChen
 * @filename jsonTest
 * @date 2020/1/10 15:40
 * @description Json的学习
 */
public class jsonTest {
    /**
     * JSONObject和JSONArray的数据表示形式
     * JSONObject的数据是用 { } 来表示的，
     * 例如： { "id" : "123", "courseID" : "huangt-test", "title" : "提交作业", "content" : null }
     * JSONArray，顾名思义是由JSONObject构成的数组，用 [ { } , { } , ...... , { } ] 来表示
     * 例如：[{ "id" : "123","courseID" : "huangt-test","title" : "提交作业" } , {"content" : null,"beginTime" : 1398873600000 "endTime" } ]；
     * 表示了包含2个JSONObject的JSONArray。
     * 可以看到一个很明显的区别，一个最外面用的是 { } ，一个最外面用的是 [ ]
     */
    public static void main(String[] args) throws JsonProcessingException {
        LocalDateTime now = LocalDateTime.now();
        Person person = new Person();
        person.setId("1234");
        person.setName("John");
        person.setSkills(Arrays.asList("Java","Linux","JS"));
        person.setCreateTime(now);
        System.out.println(person);
        String json = JsonUtils.objToJsonString(person);
        System.out.println(json);

        String person1 = "{\"id\":\"1234\",\"name\":\"John\",\"skills\":[\"Java\",\"Linux\",\"JS\"],\"createTime\":\""+ DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(now)+"\"}";
        Assertions.assertEquals(json, person1);

        Person person2 = (Person) JsonUtils.jsonStringToObj(person1, Person.class);
        System.out.println(person2.getName());
        Assertions.assertEquals(person2.getName(), "John");
        Assertions.assertEquals(person2.getSkills().toString(), "[Java, Linux, JS]");
    }
}
