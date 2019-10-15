package hst.peter.patterns.observer.first;


import java.util.ArrayList;
import java.util.List;

/**
 * @author peter.huang
 * @date 2019/10/14 8:08
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = this.observers.indexOf(observer);
        if (i != -1) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        if (this.observers.size() > 0xF)
            this.observers.parallelStream().forEach(x -> x.update(this.temperature, this.humidity, this.pressure));
        else
            this.observers.forEach(x -> x.update(this.temperature, this.humidity, this.pressure));

    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
