import hst.peter.patterns.observer.first.CurrentConditionsDisplay;
import hst.peter.patterns.observer.first.ForecastDisplay;
import hst.peter.patterns.observer.first.StatistcsDisplay;
import hst.peter.patterns.observer.first.WeatherData;
import org.junit.Test;

/**
 * @author peter.huang
 * @date 2019/10/14 8:24
 */
public class ObserverPatternTest {

    @Test
    public void firstObserver() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatistcsDisplay statistcsDisplay = new StatistcsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
