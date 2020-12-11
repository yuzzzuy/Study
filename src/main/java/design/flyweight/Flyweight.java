package design.flyweight;

/**
 * @author WangChen
 * @filename Flyweight
 * @date 2020/12/11 10:39
 * @description 抽象享元
 */
public interface Flyweight {
    /**
     * 抽象方法
     *
     * @param state 状态
     */
    public void operation(UnsharedConcreteFlyweight state);
}
