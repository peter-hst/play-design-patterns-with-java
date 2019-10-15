package hst.peter.patterns.decorator;

/**
 * 摩卡
 *
 * @author peter.huang
 * @date 2019/10/14 22:25
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .12 + beverage.cost();
    }
}
