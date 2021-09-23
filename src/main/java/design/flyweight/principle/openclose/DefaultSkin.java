package design.flyweight.principle.openclose;

/**
 * 默认皮肤类
 * @author WangChen
 * @date 2021/9/23 10:33
 */
public class DefaultSkin extends AbstractSkin{

    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
