package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(36.3f, 34f, 35.4f );

        weatherData.registerObservers(new CurrentConditionDisplay(weatherData));
        weatherData.registerObservers(new CurrentConditionDisplay(weatherData));
        weatherData.registerObservers(new CurrentConditionDisplay(weatherData));

        weatherData.notifyObservers();

    }
}
