package design.flyweight.principle.liskovsubstitution.fixup;


/**
 * 为什么 子类 不要复写 父类方法 （违反里氏代换原则）
 *
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

        Square square = new Square();
        square.setSide(10);
        printLengthAndWidth(square);
    }

    /**
     * 拓宽
     *
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
     *
     * @param quadrilateral
     */
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
