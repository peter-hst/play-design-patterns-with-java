package hst.peter.patterns.strategy;

/** 红头鸭
 * @author peter.huang
 * @date 2019/10/12 22:27
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();//默认的飞行实现
        quackBehavior =new Quack(); // 默认的叫声实现
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
