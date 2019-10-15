package hst.peter.patterns.strategy;

/**
 * @author peter.huang
 * @date 2019/10/12 22:19
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
