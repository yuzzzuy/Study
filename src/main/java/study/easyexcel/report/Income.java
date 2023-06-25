package study.easyexcel.report;

import lombok.Data;

/**
 * @author WangChen
 * @date 2023/1/10 11:33
 * @description 账户收入类
 */
@Data
public class Income {
    /**
     * @name 净流入差为负的月份占比（个人）
     * @description 每月来自个人的流入总额减去前一个月来自个人的流入总额为负数的月份数/（账单月份数-1） * 账单月份-1是因为账单中无法找到账单开始第一月前一个月的流入金额
     */
    private double m_rt_p_neg_in_diff;
    /**
     * @name 净流入差为负的月份占比（公司）
     * @description 每月来自公司的流入总额减去前一个月来自公司的流入总额为负数的月份数/（账单月份数-1）
     */
    private double m_rt_c_neg_in_diff;
    /**
     * @name 净流入差为负的月份占比（支付宝）
     * @description 每月来自支付宝的流入总额减去前一个月来自支付宝的流入总额为负数的月份数/（账单月份数-1）
     */
    private double m_rt_a_neg_in_diff;
    /**
     * @name 净流入差为负的月份占比（微信）
     * @description 每月来自微信的流入总额减去前一个月来自微信的流入总额为负数的月份数/（账单月份数-1）
     */
    private double m_rt_w_neg_in_diff;
    /**
     * @name 最近三个月平均流入
     * @description 比如账单起止日期20220101-20220701,最近三个月就是20220401-20220701，计算最近三月的月均流入额
     */
    private double avg_in_recent_m3;
    /**
     * @name 净流入超过3k的月份数比例
     * @description 统计每月的流入总金额，超过3000的月份数/账单月份数
     */
    private double m_rt_in_over_3k;
    /**
     * @name 净流入超过5k的月份数比例
     * @description 统计每月的流入总金额，超过5000的月份数/账单月份数
     */
    private double m_rt_in_over_5k;
    /**
     * @name 净流入超过10k的月份数比例
     * @description 统计每月的流入总金额，超过3000的月份数/账单月份数
     */
    private double m_rt_in_over_10k;
    /**
     * @name 净流入超过15k的月份数比例
     * @description 统计每月的流入总金额，超过15000的月份数/账单月份数
     */
    private double m_rt_in_over_15k;
    /**
     * @name 净流入超过20k的月份数比例
     * @description 统计每月的流入总金额，超过20000的月份数/账单月份数
     */
    private double m_rt_in_over_20k;
    /**
     * @name 净流入连续超过3k的月份数比例
     * @description 统计每月的流入总金额，连续超过3000的月份数/账单月份数
     */
    private double m_rt_in_cont_over_3k;
    /**
     * @name 净流入连续超过5k的月份数比例
     */
    private double m_rt_in_cont_over_5k;
    /**
     * @name 净流入连续超过10k的月份数比例
     */
    private double m_rt_in_cont_over_10k;
    /**
     * @name 净流入连续超过15k的月份数比例
     */
    private double m_rt_in_cont_over_15k;
    /**
     * @name 净流入连续超过20k的月份数比例
     */
    private double m_rt_in_cont_over_20k;
    /**
     * @name 来自流入最多那家公司的月均流入
     */
    private double avg_in_from_main_company;
    /**
     * @name 来自流入最多那个个人的月均流入
     */
    private double avg_in_from_main_person;
    /**
     * @name 最长连续每个月都有净流入来自于同一个公司的月份数占比
     */
    private double max_m_rt_cont_in_from_same_company;
    /**
     * @name 最长连续每个月都有净流入来自于同一个个人的月份数占比
     */
    private double max_m_rt_cont_in_from_same_person;
    /**
     * @name 流入最多那个公司流入的月份数占比
     */
    private double m_rt_from_main_company;
    /**
     * @name 净流入来自公司的个数
     */
    private int company_cnt;
    /**
     * @name 净流入来自个人的个数
     */
    private int person_cnt;
    /**
     * @name 净流入来自公司的比例
     */
    private double amt_rt_from_company;
    /**
     * @name 净流入来自个人的比例
     */
    private double amt_rt_from_person;
    /**
     * @name 净流入来自微信的比例
     */
    private double amt_rt_from_wechat;
    /**
     * @name 净流入来自支付宝的比例
     */
    private double amt_rt_from_alipay;
    /**
     * @name 净流入来自其他的比例
     */
    private double amt_rt_from_other;
    /**
     * @name 来自公司月流入额最大值
     */
    private double max_in_from_company;
    /**
     * @name 来自公司月流入额最小值
     */
    private double min_in_from_company;
    /**
     * @name 来自公司月流入额中位数
     */
    private double med_in_from_company;
    /**
     * @name 来自公司月流入额平均值
     */
    private double avg_in_from_company;
    /**
     * @name 来自个人月流入额最大值
     */
    private double max_in_from_person;
        /**
     * @name 来自个人月流入额最小值
     */
    private double min_in_from_person;
    /**
     * @name 来自个人月流入额中位数
     */
    private double med_in_from_person;
    /**
     * @name 来自个人月流入额平均值
     */
    private double avg_in_from_person;
    /**
     * @name 来自支付宝月流入额最大值
     */
    private double max_in_from_alipay;
    /**
     * @name 来自支付宝月流入额最小值
     */
    private double min_in_from_alipay;
    /**
     * @name 来自支付宝月流入额中位数
     */
    private double med_in_from_alipay;
    /**
     * @name 来自支付宝月流入额平均数
     */
    private double avg_in_from_alipay;
    /**
     * @name 来自微信月流入额最大值
     */
    private double max_in_from_wechat;
    /**
     * @name 来自微信月流入额最小值
     */
    private double min_in_from_wechat;
    /**
     * @name 来自支付宝月流入额中位数
     */
    private double med_in_from_wechat;
    /**
     * @name 来自微信月流入额平均值
     */
    private double avg_in_from_wechat;
    /**
     * @name 来自理财月流入额最大值
     */
    private double max_in_from_finance;
    /**
     * @name 来自理财月流入额最小值
     */
    private double min_in_from_finance;
    /**
     * @name 来自理财月流入额中位数
     */
    private double med_in_from_finance;
    /**
     * @name 来自理财月流入额平均数
     */
    private double avg_in_from_finance;
    /**
     * @name 月可支配收入最大值
     */
    private double max_dispos_in;
    /**
     * @name 月可支配收入最小值
     */
    private double min_dispos_in;
    /**
     * @name 月可支配收入中位数
     */
    private double med_dispos_in;
    /**
     * @name 月可支配收入平均值
     */
    private double avg_dispos_in;
    /**
     * @name 月可支配收入方差
     */
    private double var_dispos_in;
    /**
     * @name 月可支配收入为负的月份数占比
     */
    private double m_rt_neg_dispos_in;
    /**
     * @name 每月收入变化趋势
     */
    private double in_slope;

}
