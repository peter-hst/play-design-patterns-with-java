package hst.peter.patterns.decorator;

/**
 * @author peter.huang
 * @date 2019/10/14 22:19
 */
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
