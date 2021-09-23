package design.flyweight.principle.dip.fixup;

/**
 * @author WangChen
 * @date 2021/9/23 16:01
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //创建组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        hardDisk.save("内存条");
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        //创建计算机对象
        Computer c = new Computer();
        //组装计算机
        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);
        //运行计算机
        c.run();

    }
}
