package study.easyexcel.report;

import lombok.Data;

/**
 * @author WangChen
 * @date 2023/1/10 12:06
 * @description 账户支出类
 */
@Data
public class Expenditure {
    /**
     * 净流出到公司的比例
     */
    private double out_rt_to_company;
    /**
     * 净流出到个人的比例
     */
    private double out_rt_to_person;
    /**
     * 净流出到支付宝的比例
     */
    private double out_rt_to_alipay;
    /**
     * 净流出支付宝转账的比例
     */
    private double out_rt_to_alipay_transfer;
    /**
     * 净流出到微信的比例
     */
    private double out_rt_to_wechat;
    /**
     * 净流出微信转账的比例
     */
    private double out_rt_to_wechat_transfer;
    /**
     * 净流出到微信红包的比例
     */
    private double out_rt_to_wechat_gift;
    /**
     * 净流出到理财的比例
     */
    private double out_rt_to_finance;
    /**
     * 净流出到信用卡或还款的比例
     */
    private double out_rt_to_repay;
    /**
     * 净流出到其他的比例
     */
    private double out_rt_to_other;
    /**
     * 流出到公司的月流出额最大值
     */
    private double max_out_to_company;
    /**
     * 流出到公司的月流出额最小值
     */
    private double min_out_to_company;
    /**
     * 流出到公司的月流出额中位数
     */
    private double med_out_to_company;
    /**
     * 流出到公司的月流出额平均值
     */
    private double avg_out_to_company;
    /**
     * 流出到个人的月流出额最大值
     */
    private double max_out_to_person;
    /**
     * 流出到个人的月流出额最小值
     */
    private double min_out_to_person;
    /**
     * 流出到个人的月流出额中位数
     */
    private double med_out_to_person;
    /**
     * 流出到个人的月流出额平均值
     */
    private double avg_out_to_person;
    /**
     * 流出到支付宝的月流出额最大值
     */
    private double max_out_to_alipay;
    /**
     * 流出到支付宝的月流出额最小值
     */
    private double min_out_to_alipay;
    /**
     * 流出到支付宝的月流出额中位数
     */
    private double med_out_to_alipay;
    /**
     * 流出到支付宝的月流出额平均值
     */
    private double avg_out_to_alipay;
    /**
     * 流出到微信的月流出额最大值
     */
    private double max_out_to_wechat;
    /**
     * 流出到微信的月流出额最小值
     */
    private double min_out_to_wechat;
    /**
     * 流出到微信的月流出额中位数
     */
    private double med_out_to_wechat;
    /**
     * 流出到微信的月流出额平均值
     */
    private double avg_out_to_wechat;
    /**
     * 流出到理财的月流出额最大值
     */
    private double max_out_to_finance;
    /**
     * 流出到理财的月流出额最小值
     */
    private double min_out_to_finance;
    /**
     * 流出到理财的月流出额中位数
     */
    private double med_out_to_finance;
    /**
     * 流出到理财的月流出额平均值
     */
    private double avg_out_to_finance;
    /**
     * 流出到还款的月流出额最大值
     */
    private double max_out_to_repay;
    /**
     * 流出到还款的月流出额最小值
     */
    private double min_out_to_repay;
    /**
     * 流出到还款的月流出额中位数
     */
    private double med_out_to_repay;
    /**
     * 流出到还款的月流出额平均值
     */
    private double avg_out_to_repay;
    /**
     * 有净流出到公司的月份占比
     */
    private double m_rt_out_to_company;
    /**
     * 净流出最高的个人总流出金额占比
     */
    private double amt_rt_out_to_main_person;
    /**
     * 净流出最高的个人的月份数占比
     */
    private double m_rt_out_to_main_person;
    /**
     * 有理财的月份数占比
     */
    private double m_rt_out_to_finance;
    /**
     * 每月支出变化趋势
     */
    private double out_slope;


}
