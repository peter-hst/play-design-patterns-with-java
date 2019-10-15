package hst.peter.patterns.strategy;

/**
 * @author peter.huang
 * @date 2019/10/12 22:20
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
