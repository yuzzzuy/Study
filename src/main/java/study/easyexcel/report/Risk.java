package study.easyexcel.report;

import lombok.Data;
import utils.RandomUtils;

/**
 * @author WangChen
 * @date 2023/1/10 11:33
 * @description 账户风险类
 */
@Data
public class Risk {
    /**
     * 活跃的天数
     * 有交易(有收入或支出)的天数
     */
    private int active_days = RandomUtils.randomRange(1,30);

    /**
     * 活跃天数占比
     * 有交易的天数/账单天数
     */
    private int active_days_rt;

    /**
     * @name 最近30天交易次数/过往平均每30天交易次数
     * @description  假设账单起止日期20220101-20220401, 最近30天交易次数=0301-0401期间的交易次数，过去平均每30天交易次数=（0201-0301期间交易次数 + 0101-0201期间交易次数）/2
     */
    private double d30_cnt_vs_past_d30_avg_cnt;
    /**
     * @name 最近30天流入金额/过往平均每30天流入金额
     * @description  假设账单起止日期20220101-20220401, 最近30天流入金额=0301-0401期间的流入总金额，过去平均每30天流入额=（0201-0301期间流入总额 + 0101-0201期间流入总额）/2
     */
    private double d30_in_vs_past_d30_avg_in;
    /**
     * @name 最近30天流出金额/过往平均每30天流出金额
     * @description  假设账单起止日期20220101-20220401, 最近30天流出金额=0301-0401期间的流出总金额，过去平均每30天流出额=（0201-0301期间流出总额 + 0101-0201期间流出总额）/2
     */
    private double d30_out_vs_past_d30_avg_out;
    /**
     * @name 最近7天交易次数/过往平均每7天交易次数
     * @description 与d30_cnt_vs_past_d30_avg_cnt计算逻辑一样，统计周期不同，此处为7天
     */
    private double d7_cnt_vs_past_d7_avg_cnt;
    /**
     * 最近7天流入金额/过往平均每7天流入金额平均数
     */
    private double d7_in_vs_past_d7_avg_in;
    /**
     * 最近7天流出金额/过往平均每7天流出金额
     */
    private double d7_out_vs_past_d7_avg_out;
    /**
     * 最近1天交易次数/过往平均每天交易次数
     */
    private double d1_cnt_vs_past_d1_avg_cnt;
    /**
     * 最近1天流入金额/过往平均每天流入金额平均数
     */
    private double d1_in_vs_past_d1_avg_in;
    /**
     * 最近1天流出金额/过往平均每天流出金额
     */
    private double d1_out_vs_past_d1_avg_out;
    /**
     * 月均跨境交易次数
     */
    private double avg_cross_border_cnt;
    /**
     * 月均夜间交易次数
     */
    private double avg_night_cnt;
}
