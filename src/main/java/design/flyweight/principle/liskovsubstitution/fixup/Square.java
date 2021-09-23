package design.flyweight.principle.liskovsubstitution.fixup;

import lombok.Data;

/**
 * @author WangChen
 * @date 2021/9/23 15:23
 */
@Data
public class Square implements Quadrilateral {
    private double side;

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
