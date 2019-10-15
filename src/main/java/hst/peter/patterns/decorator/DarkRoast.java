package hst.peter.patterns.decorator;

/**
 * @author peter.huang
 * @date 2019/10/14 22:21
 */
public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
