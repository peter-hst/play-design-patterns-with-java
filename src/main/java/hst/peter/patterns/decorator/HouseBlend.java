package hst.peter.patterns.decorator;

/**
 * @author peter.huang
 * @date 2019/10/14 22:21
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
