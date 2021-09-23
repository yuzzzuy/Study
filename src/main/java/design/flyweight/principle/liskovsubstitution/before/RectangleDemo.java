package design.flyweight.principle.liskovsubstitution.before;

/**
 * 为什么 子类 不要复写 父类方法 （违反里氏代换原则）
 * @author WangChen
 * @date 2021/9/23 15:27
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        //拓宽
        resize(r);
        printLengthAndWidth(r);

        System.out.println("~~~~~~~~~~~~");

        Square s  = new Square();
        s.setLength(10);
        //死循环
//        resize(s);
        printLengthAndWidth(s);
    }

    /**
     * 拓宽
     * @param rectangle
     */
    public static void resize(Rectangle rectangle) {
        //判断 width 比 length 小 扩宽
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    /**
     * 打印 length 和 width
     * @param rectangle
     */
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
