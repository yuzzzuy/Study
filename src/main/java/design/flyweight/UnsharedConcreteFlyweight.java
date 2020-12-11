package design.flyweight;

/**
 * @author WangChen
 * @filename UnsharedConcreteFlyweight
 * @date 2020/12/11 10:40
 * @description 非享元
 */
public class UnsharedConcreteFlyweight {

    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
