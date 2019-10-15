package hst.peter.patterns.decorator;

/**
 * @author peter.huang
 * @date 2019/10/14 22:15
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
