package hst.peter.patterns.observer.first;

/**
 * @author peter.huang
 * @date 2019/10/14 8:04
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float presure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: Watch out for cooler, rainy weather");
    }

    @Override
    public void update(float temp, float humidity, float presure) {
        this.temperature = temp;
        display();
    }
}
