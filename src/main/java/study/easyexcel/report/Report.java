package study.easyexcel.report;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import utils.JsonUtils;

import java.util.Date;

/**
 * @author WangChen
 * @date 2023/1/10 10:53
 * @description
 */
@Data
public class Report {
    @ExcelProperty("账户综合")
    private Summary summary;
    @ExcelProperty("账户风险")
    private Risk risk;
    @ExcelProperty("账户收入")
    private Income income;
    @ExcelProperty("账户支出")
    private Expenditure expenditure;

}
