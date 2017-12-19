package com.company;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update (Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println(String.format("Current condition = %s, humidity - %s, pressure - %s",
                temperature, humidity, pressure));
    }

}
