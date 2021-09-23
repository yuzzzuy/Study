package design.flyweight.principle.liskovsubstitution.fixup;

import lombok.Data;

/**
 * @author WangChen
 * @date 2021/9/23 15:23
 */
@Data
public class Rectangle implements Quadrilateral {
    private double length;
    private double width;

}
