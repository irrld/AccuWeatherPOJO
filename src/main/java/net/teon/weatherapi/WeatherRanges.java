package net.teon.weatherapi;

public class WeatherRanges {
    private WeatherRange Past6HourRange;
    private WeatherRange Past12HourRange;
    private WeatherRange Past24HourRange;

    public WeatherRanges(WeatherRange past6HourRange, WeatherRange past12HourRange, WeatherRange past24HourRange) {
        Past6HourRange = past6HourRange;
        Past12HourRange = past12HourRange;
        Past24HourRange = past24HourRange;
    }

    public WeatherRange getPast6HourRange() {
        return Past6HourRange;
    }

    public WeatherRange getPast12HourRange() {
        return Past12HourRange;
    }

    public WeatherRange getPast24HourRange() {
        return Past24HourRange;
    }
}
