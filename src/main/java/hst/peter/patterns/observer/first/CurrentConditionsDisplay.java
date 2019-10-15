package hst.peter.patterns.observer.first;

/**
 * @author peter.huang
 * @date 2019/10/14 8:04
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity ");
    }

    @Override
    public void update(float temp, float humidity, float presure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
