package study.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.util.ListUtils;
import com.alibaba.excel.write.metadata.WriteSheet;
import lombok.Data;
import lombok.Value;
import org.apache.poi.ss.formula.functions.T;
import study.easyexcel.report.*;
import utils.JsonUtils;
import utils.RandomUtils;

import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        String templateFileName ="/Users/yuzhongxunfeng/java/git/Study/src/main/resources/template.xlsx";
//        Report report = new Report();
//
//        Summary summary = new Summary();
//        Map summaryMap = getValue( JsonUtils.objToMap(summary));
//        summary = JsonUtils.mapToObj(summaryMap,Summary.class);
//
//        Risk risk = new Risk();
//        Map riskMap = getValue( JsonUtils.objToMap(risk));
//        risk = JsonUtils.mapToObj(riskMap, Risk.class);
//
//        Expenditure expenditure = new Expenditure();
//        Map expenditureMap = getValue( JsonUtils.objToMap(expenditure));
//        expenditure = JsonUtils.mapToObj(expenditureMap, Expenditure.class);
//
//        Income income = new Income();
//        Map incomeMap = getValue( JsonUtils.objToMap(income));
//        income = JsonUtils.mapToObj(incomeMap, Income.class);
//
//        report.setExpenditure(expenditure);
//        report.setRisk(risk);
//        report.setSummary(summary);
//        report.setIncome(income);
//        System.out.println(JsonUtils.objToJsonString(report));
//
//        String fileName =  "报告Demo2" + ".xlsx";
//        try (ExcelWriter excelWriter = EasyExcel.write(fileName).withTemplate(templateFileName).build()) {
//            WriteSheet writeSheet = EasyExcel.writerSheet("测试").build();
//            excelWriter.fill(summary, writeSheet);
//            excelWriter.fill(income, writeSheet);
//            excelWriter.fill(risk, writeSheet);
//            excelWriter.fill(expenditure, writeSheet);
//        }

    }

    public static Map getValue(Map map){
        map.forEach((key, value)->{

            if(value instanceof Double){
                map.put(key,RandomUtils.doubleRandom(100));
            }else if(value == null) {
                value = "张三";
            }else {
                map.put(key,RandomUtils.randomRange(10,1000));
            }

        });
        return map;
    }
}
