package design.flyweight.principle.openclose;

/**
 * @author WangChen
 * @date 2021/9/23 13:52
 */
public class Client {
    public static void main(String[] args) {
        //创建输入法对象
        SouGouInput input = new SouGouInput();
        //创建皮肤对象
        DefaultSkin defaultSkin = new DefaultSkin();
        //设置皮肤
        input.setSkin(defaultSkin);

        //显示皮肤
        input.display();
    }
}
