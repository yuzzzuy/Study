package design.flyweight.principle.dip.fixup;

/**
 * @author WangChen
 * @date 2021/9/23 15:56
 */
public class KingstonMemory implements Memory{

    @Override
    public void save(){
        System.out.println("使用金士顿内存条");
    }
}
