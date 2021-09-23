package design.flyweight.principle.openclose;

import lombok.Data;

/**
 * @author WangChen
 * @date 2021/9/23 13:51
 */
@Data
public class SouGouInput {
    private AbstractSkin skin;

    public void display() {
        skin.display();
    }
}
