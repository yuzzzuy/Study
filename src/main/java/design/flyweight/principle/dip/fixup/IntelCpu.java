package design.flyweight.principle.dip.fixup;

/**
 * @author WangChen
 * @date 2021/9/23 16:31
 */
public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("运行 Intel cpu!");
    }
}
