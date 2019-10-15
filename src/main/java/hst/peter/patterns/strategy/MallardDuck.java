package hst.peter.patterns.strategy;

/** 绿头鸭
 * @author peter.huang
 * @date 2019/10/12 22:25
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings(); //默认的飞行实现
        quackBehavior = new Quack(); // 默认的叫声实现（嘎嘎叫）
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
