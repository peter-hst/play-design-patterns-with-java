package hst.peter.patterns.strategy;

/**
 * @author peter.huang
 * @date 2019/10/12 22:23
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        //默认的飞行实现（模型鸭不会飞）
        flyBehavior = new FlyBehavior() {
        };

        // 默认的叫声实现（模型鸭不会叫）
        quackBehavior = new QuackBehavior() {
        };
    }

    @Override
    public void display() {
        System.out.println("I'm a Model duck");
    }
}
