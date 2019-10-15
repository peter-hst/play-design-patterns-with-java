import hst.peter.patterns.strategy.*;
import org.junit.Test;

/**
 * @author peter.huang
 * @date 2019/10/12 22:33
 */
public class StrategyPatternTest {

    @Test
    public void miniDuckSimulator() {
        Duck mallard = new MallardDuck(); // 绿头鸭
        mallard.display();
        mallard.preformFly();
        mallard.preformQuack();

        Duck model = new ModelDuck(); //模型鸭
        model.display();
        model.preformFly();
        model.preformQuack();

        Duck redhead = new RedheadDuck(); // 红头鸭
        redhead.display();
        redhead.preformFly();
        redhead.preformQuack();

        Duck rubber = new RubberDuck(); // 橡皮鸭
        rubber.display();
        rubber.preformFly();
        rubber.preformQuack();

        // 随时可改变模型鸭的飞行实现
        model.setFlyBehavior(new FlyRocketPowered());
        model.display();
        model.preformFly();
    }
}
