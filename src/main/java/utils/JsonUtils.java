package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.formula.functions.T;

import javax.annotation.Resource;

/**
 * @author WangChen
 * @date 2023/1/9 16:18
 * @description
 */
public class JsonUtils {
    private static final ObjectMapper MAPPER = new ObjectMapper().findAndRegisterModules();



    public static String objToJsonString(Object obj) throws JsonProcessingException {
        return MAPPER.writeValueAsString(obj);
    }
    public static Object jsonStringToObj(String jsonString ,Class<?> clas) throws JsonProcessingException {
        return MAPPER.readValue(jsonString,clas);
    }
}
