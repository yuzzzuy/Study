package design.flyweight.principle.liskovsubstitution.before;

/**
 * @author WangChen
 * @date 2021/9/23 15:23
 */
public class Square extends Rectangle{

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
