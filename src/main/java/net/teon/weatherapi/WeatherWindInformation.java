package net.teon.weatherapi;

public class WeatherWindInformation {
    private WeatherDirection Direction;
    private WeatherUnitData Speed;

    public WeatherWindInformation(WeatherDirection direction, WeatherUnitData speed) {
        Direction = direction;
        Speed = speed;
    }

    public WeatherDirection getDirection() {
        return Direction;
    }

    public WeatherUnitData getSpeed() {
        return Speed;
    }
}
