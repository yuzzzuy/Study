package demo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author WangChen
 * @filename demo212
 * @date 2020/9/23 19:24
 * @description
 */
@Data
public class Demotest implements Serializable {
    private static final long serialVersionUID = -5038449244000338188L;
    private BigDecimal id;
    private String name;
    private String sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Demotest demotest = (Demotest) o;
        return Objects.equals(name, demotest.name)
                && Objects.equals(sex, demotest.sex);
    }

}
