package design.flyweight.principle.dip.fixup;

import lombok.Data;

/**
 * @author WangChen
 * @date 2021/9/23 16:27
 */
@Data
public class XiJieHardDisk implements HardDisk {
    private String data;

    @Override
    public void save(String data) {
        this.data = data;
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    @Override
    public String get() {
        System.out.println("使用希捷硬盘提取数据");
        return data;
    }
}
