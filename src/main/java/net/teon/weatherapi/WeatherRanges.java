package net.teon.weatherapi;

@lombok.Getter
public class WeatherRanges {
    private WeatherRange Past6HourRange;
    private WeatherRange Past12HourRange;
    private WeatherRange Past24HourRange;
}
