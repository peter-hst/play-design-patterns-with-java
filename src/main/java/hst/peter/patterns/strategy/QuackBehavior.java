package hst.peter.patterns.strategy;

public interface QuackBehavior {

    // 接口默认实现，给不会叫的鸭子使用
    default void quack() {
        System.out.println("<<Silence>>");
    }
}
