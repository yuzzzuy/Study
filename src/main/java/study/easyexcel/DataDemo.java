package study.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.util.ListUtils;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author WangChen
 * @date 2022/2/22 15:22
 * @description
 */
@Data
public class DataDemo {
    @ExcelProperty("字符串标题")
    private String string;
    @ExcelProperty("日期标题")
    private Date date;
    @ExcelProperty("数字标题")
    private Double doubleData;
    @ExcelIgnore
    private String ignore;



    public static List<DataDemo> data() {
        List<DataDemo> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            DataDemo data = new DataDemo();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }
        return list;
    }

    public static void main(String[] args) {
        String fileName =  "simpleWrite" + System.currentTimeMillis() + ".xlsx";
        EasyExcel.write(fileName, DataDemo.class)
                .sheet("模板")
                .doWrite(DataDemo::data);
    }
}
