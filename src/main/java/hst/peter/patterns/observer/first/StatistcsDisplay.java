package hst.peter.patterns.observer.first;

/**
 * @author peter.huang
 * @date 2019/10/14 8:04
 */
public class StatistcsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float presure;
    private Subject weatherData;

    public StatistcsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistcs: Avg/Max/Min temperature:" + temperature + "/" + temperature + "/" + temperature);
    }

    @Override
    public void update(float temp, float humidity, float presure) {
        this.temperature = temp;
        display();
    }
}
