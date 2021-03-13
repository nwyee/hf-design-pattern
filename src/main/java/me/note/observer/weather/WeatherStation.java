package me.note.observer.weather;

import me.note.observer.weather.observer.ForecastDisplay;
import me.note.observer.weather.observer.HeatIndexDisplay;
import me.note.observer.weather.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(80, 70, 29.4f);

        weatherData.registerObserver(forecastDisplay);
        weatherData.setMeasurement(80, 90, 28.4f);
    }
}
