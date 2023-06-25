package study.easyexcel.report;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author WangChen
 * @date 2023/1/10 10:57
 * @description 账户综合类
 */
@Data
public class Summary {
//    /**
//     * 银行卡号
//     */
//    private String card_no;
//
//    /**
//     * 余额
//     */
//    private double balance;

    /**
     * 账单天数
     */
    private int bill_days;

    /**
     * 总交易次数
     * 所有的收入和支出交易的总次数
     */
    private int all_cnt;

    /**
     * 月交易次数最大值
     * 统计每月的交易次数，取最大交易次数
     */
    private int max_cnt_by_m;

    /**
     * 月交易次数最小值
     * 统计每月的交易次数，取最小交易次数
     */
    private int min_cnt_by_m;

    /**
     * 月交易次数中位数
     * 统计每月的交易次数，取中位数
     */
    private double med_cnt_by_m;

    /**
     * 月交易次数平均值
     * 统计每月的交易次数，取交易次数的均值
     */
    private double avg_cnt_by_m;

    /**
     * 月交易次数方差
     * 统计每月的交易次数，取交易次数的方差
     */
    private int var_cnt_by_m;

    /**
     * 天交易次数最大值
     * 统计每天的交易次数，取最大交易次数
     */
    private int max_cnt_by_d;

    /**
     * 天交易次数最小值
     * 统计每天的交易次数，取最小交易次数
     */
    private int min_cnt_by_d;

    /**
     * 天交易次数中位数
     * 统计每天的交易次数，取交易次数的中位数
     */
    private double med_cnt_by_d;

    /**
     * 天交易次数平均值
     * 统计每天的交易次数，取交易次数的均值
     */
    private double avg_cnt_by_d;

    /**
     * 天交易次数方差
     * 统计每天的交易次数，取交易次数的方差
     */
    private double var_cnt_by_d;

    /**
     * 总流出额
     * 账单的总支出额
     */
    private double all_out;

    /**
     * 流出天数占比
     * 有支出的天数/账单天数
     */
    private double out_days_rt;

    /**
     * 月流出额最小值
     * 统计每月的流出总金额，取最小值
     */
    private double min_out_by_m;

    /**
     * 月流出额最大值
     * 统计每月的流出总金额，取最大值
     */
    private double max_out_by_m;

    /**
     * 月流出额中位数
     * 统计每月的流出总金额，取中位数
     */
    private double med_out_by_m;

    /**
     * 月流出额平均数
     * 统计每月的流出总金额，取平均值
     */
    private double avg_out_by_m;

    /**
     * 月流出额方差
     * 统计每月的流出总金额，取方差
     */
    private double var_out_by_m;

    /**
     * 日流出额最小值
     * 统计每天的流出总金额，取最小值
     */
    private double min_out_by_d;

    /**
     * 日流出额最大值
     * 统计每天的流出总金额，取最大值
     */
    private double max_out_by_d;

    /**
     * 日流出额中位数
     * 统计每天的流出总金额，取方差
     */
    private double med_out_by_d;

    /**
     * 日流出额平均值
     * 统计每天的流出总金额，取平均数
     */
    private double avg_out_by_d;

    /**
     * 日流出额方差
     * 统计每天的流出总金额，取方差
     */
    private double var_out_by_d;

    /**
     * 总流入额
     * 账单的总收入额
     */
    private double all_in;

    /**
     * 流入天数占比
     * 有收入的天数/账单天数
     */
    private double in_days_rt;

    /**
     * 月流入额最小值
     * 统计每月流入总金额，取最小值
     */
    private double min_in_by_m;

    /**
     * 月流入额最大值
     * 统计每月流入总金额，取最大值
     */
    private double max_in_by_m;

    /**
     * 月流入额中位数
     * 统计每月流入总金额，取中位数
     */
    private double med_in_by_m;

    /**
     * 月流入额平均数
     * 统计每月流入总金额，取平均值
     */
    private double avg_in_by_m;

    /**
     * 月流入额方差
     * 统计每月流入总金额，取方差
     */
    private double var_in_by_m;

    /**
     * 日流入额最小值
     * 统计每天流入总金额，取最小值
     */
    private double min_in_by_d;

    /**
     * 日流入额最大值
     * 统计每天流入总金额，取最大值
     */
    private double max_in_by_d;

    /**
     * 日流入额中位数
     * 统计每天流入总金额，取中位数
     */
    private double med_in_by_d;

    /**
     * 日流入额平均值
     * 统计每天流入总金额，取平均值
     */
    private double avg_in_by_d;

    /**
     * 日流入额方差
     * 统计每天流入总金额，取方差
     */
    private double var_in_by_d;

    /**
     * 月余额最小值
     * 统计每月的账户余额，取最小值
     */
    private double min_bal_by_m;

    /**
     * 月余额最大值
     * 统计每月的账户余额，取最大值
     */
    private double max_bal_by_m;

    /**
     * 月余额中位数
     * 统计每月的账户余额，取中位数
     */
    private double med_bal_by_m;

    /**
     * 月余额平均值
     * 统计每月的账户余额，取平均值
     */
    private double avg_bal_by_m;

    /**
     * 月余额方差
     * 统计每月的账户余额，取方差
     */
    private double var_bal_by_m;

    /**
     * 日余额最小值
     * 统计每天的账户余额，取最小值
     */
    private double min_bal_by_d;

    /**
     * 日余额最大值
     * 统计每天的账户余额，取最大值
     */
    private double max_bal_by_d;

    /**
     * 日余额中位数
     * 统计每天的账户余额，取中位数
     */
    private double med_bal_by_d;

    /**
     * 日余额平均值
     * 统计每天的账户余额，取平均值
     */
    private double avg_bal_by_d;

    /**
     * 日余额方差
     * 统计每天的账户余额，取方差
     */
    private double var_bal_by_d;

    /**
     * 周末日均交易次数/周内日均交易次数
     * 周末平均每天的交易次数/周内平均每天的交易次数
     */
    private double wkd_avg_cnt_vs_wk_avg_cnt;

    /**
     * 周末日均交易额/周内日均交易额
     * 周末平均每天的交易额/周内平均每天的交易额
     */
    private double wkd_avg_amt_vs_wk_avg_amt;

}
