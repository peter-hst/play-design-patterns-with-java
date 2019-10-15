package hst.peter.patterns.strategy;

public interface FlyBehavior {

//  接口默认实现，给不会飞的鸭子用
    default void fly(){
        System.out.println("I can't fly");
    }
}
