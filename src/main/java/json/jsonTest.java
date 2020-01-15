package json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @author WangChen
 * @filename jsonTest
 * @date 2020/1/10 15:40
 * @description Json的学习
 */
public class jsonTest {
    /**
     * JSONObject和JSONArray的数据表示形式
     * JSONObject的数据是用 {  } 来表示的，
     * 例如：   { "id" : "123", "courseID" : "huangt-test", "title" : "提交作业", "content" : null  }  
     * JSONArray，顾名思义是由JSONObject构成的数组，用  [ { } , { } , ......  , { } ]  来表示
     * 例如：[ {  "id" : "123", "courseID" : "huangt-test", "title" : "提交作业" }  ,  {  "content" : null, "beginTime" : 1398873600000  "endTime" } ] ； 
     * 表示了包含2个JSONObject的JSONArray。
     * 可以看到一个很明显的区别，一个最外面用的是 {  }  ，一个最外面用的是 [  ]  
     */
    public static void main(String[] args) {
        File file = new File("E:\\项目素材\\Json\\chinese-poetry\\json\\authors.song.json");
        String params = null;
        try {
            params = FileUtils.readFileToString(file, "utf-8");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JSONArray jsonArray = JSONArray.parseArray(params);
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        System.out.println(jsonObject.getString("name"));
    }
}
