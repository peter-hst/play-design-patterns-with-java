package hst.peter.patterns.strategy;

/** 橡皮鸭
 * @author peter.huang
 * @date 2019/10/12 22:29
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        //默认的飞行实现（橡皮鸭不会飞）
        flyBehavior = new FlyBehavior() {
        };
        // 默认的叫声实现（橡皮鸭吱吱吱叫）
        quackBehavior= new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
