package hst.peter.patterns.strategy;

/**
 * @author peter.huang
 * @date 2019/10/12 21:57
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void preformFly() {
        flyBehavior.fly();
    }

    public void preformQuack() {
        quackBehavior.quack();
    }

    public void swim() { //所以的鸭子都可以游泳
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
