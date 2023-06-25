package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.formula.functions.T;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author WangChen
 * @date 2023/1/9 16:18
 * @description
 */
public class JsonUtils {
    private static final ObjectMapper MAPPER = new ObjectMapper().findAndRegisterModules();



    public static String objToJsonString(Object obj) {
        String res = null;
        try {
           res = MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
    public static <T>T jsonStringToObj(String jsonString ,Class<T> clas){
        try {
            return MAPPER.readValue(jsonString,clas);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map objToMap(Object obj){
        try {
            return MAPPER.readValue(MAPPER.writeValueAsString(obj), Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T>T mapToObj(Map map ,Class<T> clas){
        try {
            return MAPPER.convertValue(map, clas);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
