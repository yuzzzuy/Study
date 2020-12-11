package se.demo;

/**
 * @author WangChen
 * @filename Test
 * @date 2020/12/11 15:14
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(20);
        Circle.Draw draw = circle.new Draw();
        draw.drawShape();
    }
}
