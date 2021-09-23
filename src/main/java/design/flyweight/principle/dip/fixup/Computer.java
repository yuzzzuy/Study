package design.flyweight.principle.dip.fixup;

import lombok.Data;

/**
 * @author WangChen
 * @date 2021/9/23 16:00
 */
@Data
public class Computer {
    private HardDisk hardDisk;

    private Cpu cpu;

    private Memory memory;

    public void run() {
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }

}
