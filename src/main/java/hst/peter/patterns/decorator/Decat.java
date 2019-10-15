package hst.peter.patterns.decorator;

/**
 * @author peter.huang
 * @date 2019/10/14 22:21
 */
public class Decat extends Beverage {
    @Override
    public String getDescription() {
        return "Decat";
    }

    @Override
    public double cost() {
        return .15;
    }
}
