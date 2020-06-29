package net.teon.weatherapi;

public class WeatherWindGust {
    private WeatherUnitData Speed;

    public WeatherWindGust(WeatherUnitData speed) {
        Speed = speed;
    }

    public WeatherUnitData getSpeed() {
        return Speed;
    }
}
