package design.flyweight.principle.dip.fixup;

/**
 * @author WangChen
 * @date 2021/9/23 16:26
 */
public interface HardDisk {
    /**
     * 存储数据
     * @param data 数据
     */
    void save(String data);

    /**
     * 获取数据
     * @return 数据
     */
    String get();

}
