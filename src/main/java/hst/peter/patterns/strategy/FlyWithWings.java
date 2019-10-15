package hst.peter.patterns.strategy;

/**
 * @author peter.huang
 * @date 2019/10/12 22:15
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
